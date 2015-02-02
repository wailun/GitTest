package com.wm.pj01;

/**
 * Created by wm on 14-9-16.
 */
public abstract class BackCall {
    public void process(){
        sonProcess1();
        sonProcess2();
        sonProcess3();
    }
    protected abstract void sonProcess1();

    private void sonProcess2(){
        System.out.println("sonProcess2");
    }
    protected abstract void sonProcess3();

}
