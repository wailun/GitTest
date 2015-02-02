package com.wm.pj01;

/**
 * Created by wm on 14-9-22.
 */
public class Test0922 {
    public static void main(String[] args) {
      printbit(-8);
      //System.out.println(Integer.toBinaryString(-8));
    }

   private static void printbit(int a){
        if(a==0) return;
        else {
            printbit(a >>> 1);
            if ((a & 1) == 1) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }


}
