package com.papermaker.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;

/**
 * Created by 世康 on 2016/12/19.
 * @Description:通过freemarker实现word填充
 */
public class WordGeneratorWithFreemarker {
    private static Configuration configuration = null;

    static {
        configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setDefaultEncoding("utf-8");
        configuration.setClassicCompatible(true);
        configuration.setClassForTemplateLoading(
                WordGeneratorWithFreemarker.class,
                "/com/papermaker/test/ftl");

    }

    private WordGeneratorWithFreemarker() {

    }

    public static void createDoc(Map<String, Object> dataMap,String templateName, OutputStream out)throws Exception {
        Template t = configuration.getTemplate(templateName);
        t.setEncoding("utf-8");
        WordHtmlGeneratorHelper.handleAllObject(dataMap);

        try {
            Writer w = new OutputStreamWriter(out,Charset.forName("utf-8"));
            t.process(dataMap, w);
            w.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
