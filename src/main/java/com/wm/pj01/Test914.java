package com.wm.pj01;

import javax.sound.midi.Soundbank;

/**
 * Created by wm on 14-9-15.
 */
public class Test914 {
    private static final int a;
    static {
        a=12;
    }
    private final int b;
    {
        b=12;
        c=12;
    }
    private final int c;
    Test914(){
        
    }

    Test914(int a, int b,int c){

    }

    public static void main(String[] args) {
        Class<? extends Test914> clazz = new Test914().getClass();
        System.out.println(clazz.toString());
    }
}
