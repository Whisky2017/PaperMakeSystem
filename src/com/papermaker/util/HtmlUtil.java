package com.papermaker.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by 世康 on 2016/12/28.
 */
public class HtmlUtil {
    private String content;
    private Document doc = null;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public HtmlUtil(String content){
        this.content = content;
        doc = Jsoup.parse(wrappHtml(this.content));
//        System.out.println("doc="+doc);
    }

    public String handleHtml(){
        String newContent = doc.body().text();
//        System.out.println("new="+newContent);
        return newContent;
    }


    private String wrappHtml(String html){
        // 因为传递过来都是不完整的doc
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body>");
        sb.append(html);

        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
