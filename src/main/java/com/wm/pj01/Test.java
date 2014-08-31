package com.wm.pj01;





import com.dianping.combiz.spring.util.LionConfigUtils;

import java.security.PublicKey;

/**
 * Created by wm on 14-7-21.
 */
class Root{
    {
        System.out.println("Root 普通初始化块");
    }
    Root(){
        System.out.println("Root init");
    }

}

class Mid extends Root{
    {
        System.out.println("Mid 普通初始化块");
    }
    Mid(){
        System.out.println("Mid init");
    }
    Mid(String msg){
        this();
        System.out.println("Mid "+msg);
    }
}
class  Leaf extends Mid{
    {
        System.out.println("Leaf 普通初始化块");
    }
    public Leaf(){
        super("wm is here");
        System.out.println("Leaf init");
    }
}
public class Test {
    /*static {
        System.out.println("static");
    }

    int a=9;
    {
        a=6;
        System.out.println(a);
    }
*/
    public static void main(String[] args) {
        System.out.println();
//        System.out.println(new Test().a);
//        test(5,"dgh","dggh","dgh");
//        Integer a=-129;
//        Integer b=-129;
//       String str= LionConfigUtils.getProperty("shop-business-web.static.md5");
        System.out.println();
//        new Leaf();
    }
    public static void test(int a,String... books){
        for(String book:books){
            System.out.println(book);
        }
    }
}
