package com.papermaker.test;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.papermaker.pojo.Choice;
import com.papermaker.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

/**
 * Created by 世康 on 2016/12/28.
 */
public class ITextTest extends AbstractJUnit {
    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void test1() throws IOException, DocumentException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String[] newFilePath = new String[3];
        String[] newContent = new String[3];
//        String content =null;
//        byte[] image = null;
//        String path = null;
        for (int i = 0;i < 3;i++){
            Choice choice = (Choice)session.get(Choice.class,i+20);
            String content = choice.getContent();
            byte[] image = choice.getImage1();
            String path = ImgUtil.getImageSrc(content).get(0);
            String fileTypeName = WordImageConvertor.getFileSuffix(path);
            String filePath = "F:/PaperMaker/image/Choice";
            String fileName = choice.getId()+"."+fileTypeName;
            newFilePath[i] = filePath+"/"+fileName;

            FileOutputStream fos = null;
            BufferedOutputStream bos = null;
            try{
                File dir = new File(filePath);
                if (!dir.exists()){
                    dir.mkdirs();
                    System.out.println("目录创建成功！");
                }
                File file = new File(newFilePath[i]);
//        System.out.println(filePath+"/"+fileName);
//        file.createNewFile();
                fos = new FileOutputStream(file);
                bos = new BufferedOutputStream(fos);
                bos.write(image);
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                if (bos!=null){
                    try {
                        bos.close();
                    }catch (IOException e1){
                        e1.printStackTrace();
                    }
                }
                if (fos!=null){
                    try {
                        fos.close();
                    }catch (IOException e1){
                        e1.printStackTrace();
                    }
                }
            }
            path = path.replaceAll("\\\\","\\\\\\\\");
            newContent[i] = content.replaceFirst(path,newFilePath[i]);
        }


//        content.replaceFirst("file:///", "");
//        System.out.println("newContent="+newContent);
        HtmlUtil htmlUtil1 =new HtmlUtil(newContent[0]);
        newContent[0] = htmlUtil1.handleHtml();

        HtmlUtil htmlUtil2 =new HtmlUtil(newContent[1]);
        newContent[1] = htmlUtil2.handleHtml();

        HtmlUtil htmlUtil3 =new HtmlUtil(newContent[2]);
        newContent[2] = htmlUtil3.handleHtml();

        WordUtils wordUtils = new WordUtils();
        wordUtils.openDocument("F:\\wordDemo.doc");

        wordUtils.insertContext(newContent[0],12,Font.NORMAL);
        wordUtils.insertImg(newFilePath[0]);

//        wordUtils.insertContext(newContent[1],12,Font.NORMAL);
//        wordUtils.insertImg(newFilePath[1]);

        wordUtils.insertContext(newContent[2],12,Font.NORMAL);
        wordUtils.insertImg(newFilePath[2]);


        wordUtils.closeDocument();

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
