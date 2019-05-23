package com.activiti6.demo.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author chengdu
 */
public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("123456");
        //要加密的数据（数据库的用户名或密码)
        String url = textEncryptor.encrypt("******************");
        String username = textEncryptor.encrypt("*****");
        String password = textEncryptor.encrypt("*****");
        System.out.println("url:"+url);
        System.out.println("username:" + username);
        System.out.println("password:" + password);
    }
}
