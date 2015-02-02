package com.wm.pj01.pets;

/**
 * Created by wm on 14-10-18.
 */
public class Test1018 {
    Test1018(){
        System.out.println("Test1018 init");
    }
    static{
        Test1018 t = new Test1018();
        t.new InnerClass();
    }
   class InnerClass{
InnerClass(){
    System.out.println("InnerClass init");
}
   }

    public static void main(String[] args) {
        System.out.println("ok");
    }
}
