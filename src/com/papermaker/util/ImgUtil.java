package com.papermaker.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Blob;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
/**
 * Created by 世康 on 2016/12/17.
 */
public class ImgUtil {
    /**
     * 从HTML源码中提取图片路径，最后以一个 String 类型的 List 返回，如果不包含任何图片，则返回一个 size=0　的List
     * 需要注意的是，此方法只会提取以下格式的图片：.jpg|.bmp|.eps|.gif|.mif|.miff|.png|.tif|.tiff|.svg|.wmf|.jpe|.jpeg|.dib|.ico|.tga|.cut|.pic
     * @param htmlCode HTML源码
     * @return <img>标签 src 属性指向的图片地址的List集合
     * @author Carl He
     */
    public static List<String> getImageSrc(String htmlCode) {
        List<String> imageSrcList = new ArrayList<String>();
        Pattern p = Pattern.compile("<img\\b[^>]*\\bsrc\\b\\s*=\\s*('|\")?([^'\"\n\r\f>]+(\\.jpg|\\.bmp|\\.eps|\\.gif|\\.mif|\\.miff|\\.png|\\.tif|\\.tiff|\\.svg|\\.wmf|\\.jpe|\\.jpeg|\\.dib|\\.ico|\\.tga|\\.cut|\\.pic)\\b)[^>]*>", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(htmlCode);
        String quote = null;
        String src = null;
        while (m.find()) {
            quote = m.group(1);
            src = (quote == null || quote.trim().length() == 0) ? m.group(2).split("\\s+")[0] : m.group(2);
            imageSrcList.add(src);
        }
        return imageSrcList;
    }

    public static byte[] toByteArray(File photo) throws IOException{
        FileInputStream fis = new FileInputStream(photo);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int c = bis.read();

        while(c!=-1){
            baos.write(c);
            c=bis.read();
        }
        bis.close();
        byte[] rtn = baos.toByteArray();
        baos.close();

        return rtn;
    }

    public static void toFile(byte[] buf, String filePath, String fileName)
    {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        try
        {
            File dir = new File(filePath);
            if (!dir.exists() && dir.isDirectory())
            {
                dir.mkdirs();
            }
            file = new File(filePath + File.separator + fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(buf);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (bos != null)
            {
                try
                {
                    bos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (fos != null)
            {
                try
                {
                    fos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
