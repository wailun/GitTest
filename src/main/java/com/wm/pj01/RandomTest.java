package com.wm.pj01;

import java.util.Random;

/**
 * Created by wm on 14-9-22.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random=new Random(47);
       int i=random.nextInt(100);
        int j=random.nextInt(100);
        int k=random.nextInt(100);
        System.out.println(i+"  "+j+"    "+k);
        short p=1;
        short b=p;
    }
}
