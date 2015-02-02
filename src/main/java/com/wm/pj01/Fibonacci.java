package com.wm.pj01;

/**
 * Created by wm on 14-9-23.
 */
public class Fibonacci {
    Fibonacci(){

    }
   Fibonacci(int num){

   }
    public static void main(String[] args) {
        new Fibonacci();
fibonacci(8);

    }
    private static void fibonacci(int num){
        int a=1;
        int b=1;
        System.out.print(a + ",");
        while (--num>0){
            if(num>1) {
                System.out.print(b+",");
            }else {
                System.out.print(b);
            }
            int k=a+b;
            a=b;
            b=k;
        }
    }
}
