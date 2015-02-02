package com.wm.pj01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Unicode {
//    public static void main(String[] args) {
//        Unicode instance = new Unicode();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = "我们都是中国人";
//
//        String s = instance.getBytes(line);
//        System.out.println("bytes:" + s);
//        //System.out.println("line:"+);
//        System.out.println(new StringBuilder("").append("dgh").toString());
//
//    }

    String getBytes(String s) {
        try {
            StringBuffer out = new StringBuffer("");
            byte[] bytes = s.getBytes("unicode");
            for (int i = 2; i < bytes.length - 1; i += 2) {
                out.append("\\u");
                String str = Integer.toHexString(bytes[i + 1] & 0xff);
                for (int j = str.length(); j < 2; j++) {
                    out.append("0");
                }
                String str1 = Integer.toHexString(bytes[i] & 0xff);

                out.append(str1);
                out.append(str);
            }
            return out.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}