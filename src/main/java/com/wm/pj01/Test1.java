package com.wm.pj01;

import java.io.*;

/**
 * Created by wm on 14-9-1.
 */
public class Test1 {

    public static void main(String[] args) throws IOException {
       String str="It's my house";
//        System.out.println(Charset.defaultCharset());
//        System.out.println(str.getBytes("gbk").length);
        InputStream is = new FileInputStream("src/main/test.txt");
        InputStreamReader streamReader = new InputStreamReader(is, "GB18030");
        System.out.println(streamReader.getEncoding());
        System.out.println(is.available());
        char[] chars = new char[is.available()];
        streamReader.read(chars, 0, is.available());
        System.out.println(chars);
        System.out.println(Integer.toHexString(str.charAt(0)));

    }
}
