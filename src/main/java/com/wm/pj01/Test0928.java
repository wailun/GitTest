package com.wm.pj01;

/**
 * Created by wm on 14-9-28.
 */
public class Test0928 {
    public Test0928(){
        System.out.println("test0928");
    }
    {
        System.out.println("init field block before");
    }
    private TT t1=new TT(1);
    private TT t2=new TT(2);
    {
        System.out.println("init field block after");
    }
    public static void main(String[] args) {
        new Test0928();
    }
}
class TT{
    public TT(int i){
        System.out.println("TT("+i+")");
    }
}
