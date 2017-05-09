package com.papermaker.test;

import com.papermaker.pojo.Choice;
import com.papermaker.util.ImgUtil;
import com.papermaker.util.RichHtmlHandler;
import com.papermaker.util.WordGeneratorWithFreemarker;
import com.papermaker.util.WordImageConvertor;
import freemarker.template.MalformedTemplateNameException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;

import java.io.*;
import java.util.HashMap;

/**
 * Created by 世康 on 2016/12/18.
 */

public class DataTest extends AbstractJUnit {

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void test1() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Choice choice = (Choice)session.get(Choice.class,9);
//        Choice choice = new Choice();
//        choice.setContent("你好你好你好");
//        choice.setAnswer("测试测试测试");
//        choice.setTestpoint1("123你好");
//        choice.setScore(1);
//        choice.setWeight(3);
//        choice.setUserid(1);
//        session.save(choice);
        System.out.println(""+choice.getContent());
        System.out.println(""+choice.getAnswer());
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void test2() throws Exception {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Choice choice = (Choice)session.get(Choice.class,22);
        String content = choice.getContent();
        byte[] image = choice.getImage1();
        String path = ImgUtil.getImageSrc(content).get(0);
        String fileTypeName = WordImageConvertor.getFileSuffix(path);
//        String fileTypeName = "emz";
        String filePath = "F:/PaperMaker/image/Choice";
        String fileName = choice.getId()+"."+fileTypeName;
        String newFilePath = filePath+"/"+fileName;

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

//        System.out.println(fileName);

        try{
            File dir = new File(filePath);
//        File fileParent = file.getParentFile();
//        System.out.println(dir.exists());
//        System.out.println(dir.isDirectory());
            if (!dir.exists()){
                dir.mkdirs();
                System.out.println("目录创建成功！");
            }
            File file = new File(newFilePath);
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
        String newContent = content.replaceFirst(path,newFilePath);
//        content.replaceFirst("file:///", "");
        System.out.println(newContent);

        RichHtmlHandler handler = new RichHtmlHandler(newContent);
        handler.setDocSrcLocationPrex("file:///C:/268BA2D4");
        handler.setDocSrcParent("test.files");
        handler.setNextPartId("01D25A07.60FBEEC0");
        handler.setShapeidPrex("_x56fe__x7247__x0020");
        handler.setSpidPrex("_x0000_i");
        handler.setTypeid("#_x0000_t75");

//        handler.setDocSrcLocationPrex("file:///C:/8595226D");
//        handler.setDocSrcParent("file3405.files");
//        handler.setNextPartId("01D214BC.6A592540");
//        handler.setShapeidPrex("_x56fe__x7247__x0020");
//        handler.setSpidPrex("_x0000_i");
//        handler.setTypeid("#_x0000_t75");


        handler.handledHtml(false);

        String bodyBlock = handler.getHandledDocBodyBlock();
        System.out.println("bodyBlock:\n"+bodyBlock);

        String handledBase64Block = "";
        if (handler.getDocBase64BlockResults() != null
                && handler.getDocBase64BlockResults().size() > 0) {
            for (String item : handler.getDocBase64BlockResults()) {
                handledBase64Block += item + "\n";
            }
        }


        HashMap<String, Object> data = new HashMap<String, Object>();
//        if (data.containsKey("imagesBase64String")){
//            handledBase64Block += handledBase64Block2;
//        }
        data.put("imagesBase64String", handledBase64Block);

        String xmlimaHref = "";
        if (handler.getXmlImgRefs() != null
                && handler.getXmlImgRefs().size() > 0) {
            for (String item : handler.getXmlImgRefs()) {
                xmlimaHref += item + "\n";
            }
        }


//        System.out.println("xmlimaHref:\n"+xmlimaHref);
        data.put("imagesXmlHrefString", xmlimaHref);
//        data.put("name", "张三");
        data.put("Choice.1", bodyBlock);

        String docFilePath = "F:\\temp.doc";
//        System.out.println(docFilePath);
        File f = new File(docFilePath);
        OutputStream out;
        try {
            out = new FileOutputStream(f);
            WordGeneratorWithFreemarker.createDoc(data, "test.ftl", out);

        } catch (FileNotFoundException e) {

        } catch (MalformedTemplateNameException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        transaction.commit();;
        session.close();
        sessionFactory.close();
    }

    @Test
    public void test3() throws Exception {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Choice choice = (Choice)session.get(Choice.class,22);
        String content = choice.getContent();
        byte[] image = choice.getImage1();
        String path = ImgUtil.getImageSrc(content).get(0);
        String fileTypeName = WordImageConvertor.getFileSuffix(path);
//        String fileTypeName = "emz";
        String filePath = "F:/PaperMaker/image/Choice";
        String fileName = choice.getId()+"."+fileTypeName;
        String newFilePath = filePath+"/"+fileName;

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

//        System.out.println(fileName);

        try{
            File dir = new File(filePath);
//        File fileParent = file.getParentFile();
//        System.out.println(dir.exists());
//        System.out.println(dir.isDirectory());
            if (!dir.exists()){
                dir.mkdirs();
                System.out.println("目录创建成功！");
            }
            File file = new File(newFilePath);
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
        String newContent = content.replaceFirst(path,newFilePath);
//        content.replaceFirst("file:///", "");
        System.out.println(newContent);

        RichHtmlHandler handler = new RichHtmlHandler(newContent);
        handler.setDocSrcLocationPrex("file:///C:/268BA2D4");
        handler.setDocSrcParent("test.files");
        handler.setNextPartId("01D25A07.60FBEEC0");
        handler.setShapeidPrex("_x56fe__x7247__x0020");
        handler.setSpidPrex("_x0000_i");
        handler.setTypeid("#_x0000_t75");

//        handler.setDocSrcLocationPrex("file:///C:/8595226D");
//        handler.setDocSrcParent("file3405.files");
//        handler.setNextPartId("01D214BC.6A592540");
//        handler.setShapeidPrex("_x56fe__x7247__x0020");
//        handler.setSpidPrex("_x0000_i");
//        handler.setTypeid("#_x0000_t75");


//        System.out.println("handledBase64Block:\n"+handledBase64Block);

        handler.handledHtml(false);

        String bodyBlock = handler.getHandledDocBodyBlock();
        System.out.println("bodyBlock:\n"+bodyBlock);

        String handledBase64Block = "";
        if (handler.getDocBase64BlockResults() != null
                && handler.getDocBase64BlockResults().size() > 0) {
            for (String item : handler.getDocBase64BlockResults()) {
                handledBase64Block += item + "\n";
            }
        }


        HashMap<String, Object> data = new HashMap<String, Object>();
//        if (data.containsKey("imagesBase64String")){
//            handledBase64Block += handledBase64Block2;
//        }
        data.put("imagesBase64String", handledBase64Block);

        String xmlimaHref = "";
        if (handler.getXmlImgRefs() != null
                && handler.getXmlImgRefs().size() > 0) {
            for (String item : handler.getXmlImgRefs()) {
                xmlimaHref += item + "\n";
            }
        }


//        System.out.println("xmlimaHref:\n"+xmlimaHref);
        data.put("imagesXmlHrefString", xmlimaHref);
//        data.put("name", "张三");
        data.put("Choice2", bodyBlock);

        String docFilePath = "F:\\temp.doc";
//        System.out.println(docFilePath);
        File f = new File(docFilePath);
        OutputStream out;
        try {
            out = new FileOutputStream(f);
            WordGeneratorWithFreemarker.createDoc(data, "test.ftl", out);

        } catch (FileNotFoundException e) {

        } catch (MalformedTemplateNameException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        transaction.commit();;
        session.close();
        sessionFactory.close();
    }
}
