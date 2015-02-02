package com.wm.pj01;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * Created by wm on 14-9-28.
 */
public class StaticTest {
    //static SS ss=new SS();
    public static void main(String[] args) {
       // System.out.println("ok");
//       SS.fun();
        int a[]={1,2};
        System.out.println(Arrays.toString(a));
        System.out.println(new SS().toString());
    }
}
class SS{
    static {
        System.out.println("static block before");
    }
//    static QQ qq=new QQ("static");
    static QQ qq;
    QQ filedQQ=new QQ("filed");
    static {
        System.out.println("static block after");
    }
    public SS(){
        System.out.println("ss");
        qq=new QQ("again");
    }
    public static void fun(){
        System.out.println("fun");
    }
}
class QQ{
    static {
        System.out.println("static block qq");
    }
    public QQ(String str){
        System.out.println(str+" qq");
    }
}
