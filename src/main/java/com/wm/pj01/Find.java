package com.wm.pj01;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wm on 14-9-18.
 */
public class Find {
    public static void main(String[] args) throws IOException {
        List<Integer> file0917 = processFile("/Users/wm/Desktop/assessment0917.txt","\t",1,true);
        List<Integer> file0918=processFile("/Users/wm/Desktop/assessment0918.txt"," ",2,false);
        Iterator<Integer> iter = file0917.iterator();
        while(iter.hasNext()) {
            Integer shop = iter.next();
            if (file0918.contains(shop)) {
                file0918.remove(shop);
            }
        }
        for(int shop:file0918){
            System.out.println(shop);
        }

        
    }
    
    private static List<Integer> processFile(String fileName,String splitChar,int k,boolean flag) throws IOException {
        List<Integer> shops=new ArrayList<Integer>();
        String str;
        File file = new File(fileName);
        BufferedReader fileReader=new BufferedReader(new FileReader(file));
        while ((str=fileReader.readLine())!=null){
            String tt = str.split(splitChar)[k];
            Integer a=null;
            if(flag){
                a=Integer.valueOf(tt);
            }else {
                a=Integer.valueOf(tt.substring(0,tt.length()-1));
            }
            shops.add(a);
        }
        return shops;
    }
}
