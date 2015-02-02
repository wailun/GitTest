package com.wm.pj01;

/**
 * Created by wm on 14-9-23.
 */
public class Test0923 {
    public static void main(String[] args) {
        if(args.length!=2) return;
       int a=Integer.valueOf(args[0]);
       int b=Integer.valueOf(args[1]);
        switch (a+b){
            case 3:
                System.out.println(3);break;
            case 8:
                System.out.println(8);break;
            default:
                System.out.println(a+b+"xx");
        }
    }
}
