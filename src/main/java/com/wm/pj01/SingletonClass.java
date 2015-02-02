package com.wm.pj01;

/**
 * Created by wm on 14-8-18.
 */
public class SingletonClass {
  /*  private static  SingletonClass instance=new SingletonClass();
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2=SingletonClass.getInstance();
        System.out.println(instance1==instance2);
    }*/

    //两次加锁
    public static void main(String[] args) {
//        String line = MyException.find.getBytes("中国人");
//        System.out.println(line);
       // System.getProperties().list(System.out);
        System.out.println(System.getProperty("java.class.path"));
    }
}
