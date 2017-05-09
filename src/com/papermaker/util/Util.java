package com.papermaker.util;

import java.security.MessageDigest;

/**
 * Created by 世康 on 2016/11/24.
 */
public class Util {
    //会话标识
    public static final String SESSION_USER = "user";//当前登录用户

    //错误信息标识
    public static final String MSG_LOGIN = "login";//登录操作
    public static final String MSG_ERRORINFO = "errorinfo";//常规操作

    public static final int PAGE_SIZE = 30;//列表单页数据个数

    public final static String MD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
