package com.wm.pj01;

import java.lang.reflect.Method;

/**
 * Created by wm on 14-9-16.
 */
public class BackCallTest extends BackCall{
    @Override
    protected void sonProcess1() {
        System.out.println("BackCallTest sonProcess1");
    }
    protected void sonProcess2(){
        System.out.println("BackCallTest sonProcess2");
    }
    @Override
    protected void sonProcess3() {
        System.out.println("BackCallTest sonProcess3");
    }

    public static void main(String[] args) {
        Class<? extends BackCallTest> clazz = new BackCallTest().getClass();
        Method[] methods=clazz.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.toString());
        }
    }
}
