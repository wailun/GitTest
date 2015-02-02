package com.wm.pj01;

import java.util.*;

/**
 * Created by wm on 14-10-10.
 */
public class Test1010 {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.getYear()+1900);
        //设置两个日期
        //日期：2009年3月11号
        Calendar c1 = Calendar.getInstance();
        c1.set(2014, 10 - 1, 19,10,2);
        Calendar now=Calendar.getInstance();
       // c1.set(2009,3-1,11,0,0,0);
//        System.out.println(c1.get(Calendar.MINUTE));
////        c1.set(Calendar.HOUR,23);
//        //日期：2010年4月1号
//        Calendar c2 = Calendar.getInstance();
//        c2.set(2009, 3 - 1, 12);
//        //转换为相对时间
        long t1 = now.getTimeInMillis();
        long t2 = c1.getTimeInMillis();
//        //计算天数
        long days = (t1 - t2)/(24 * 60 * 60 * 1000);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(8);
        Collections.copy(list,a);
        Collections.sort(list);
        System.out.println(now.getTime());
    }
}
