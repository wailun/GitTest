package com.wm.pj01;

/**
 * Created by wm on 14-9-24.
 */
public class TestOverride {

    public static void main(String[] args) {
        SonSon sonSon=new SonSon();
        long i=0;
        new TestOverride().f1(sonSon);//转换为直接父类方法，结果为son

        new TestOverride().f1((short)i);
    }

    private  void f1(Base base){
        System.out.println("base");
    }

    private void f1(Son son){
        System.out.println("son");
    }
//    private  void f1(SonSon sonSon){
//        System.out.println("sonSon");
//    }

    private  void f1(int i){
        System.out.println("int");
    }
    private  void f1(short i){
        System.out.println("short");
    }


}
class Base{

}
class Son extends Base{

}
class SonSon extends Son{

}
