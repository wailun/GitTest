package com.wm.pj01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by wm on 14-9-29.
 */
public class Thread0929 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<10;++i)
        list.add(i);

//        ThreadTest t1 = new ThreadTest(list);
//        t1.start();
//        ThreadTest t2 = new ThreadTest(list);
//        t2.start();
        System.out.println(Thread.currentThread());
        ThreadTest1 t3=new ThreadTest1(list.iterator(),500);
        t3.start();
        ThreadTest1 t4=new ThreadTest1(t3.getIter(),500);
//        ThreadTest1 t4=new ThreadTest1(list.iterator(),1000);
      t4.start();

    }

}
class ThreadTest extends Thread{
    private ArrayList<Integer> list;
    ThreadTest(ArrayList<Integer> list){
        this.list=list;
    }

    public void run() {
        for(int i=0;i<list.size();++i){
            int k=list.remove(i);
            System.out.println(this.getName()+" k:"+k);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class ThreadTest1 extends Thread{
    private Iterator<Integer> iter;
    private int ms;
    ThreadTest1(Iterator<Integer> iter,int ms){
        this.iter=iter;
        this.ms=ms;
        System.out.println(this.getName()+" init");
    }
    public void run(){
        while(iter.hasNext()){
            synchronized (iter) {
            int k=iter.next();
                iter.remove();
                System.out.println(this.getName()+" k:"+k);
            }

            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Iterator<Integer> getIter() {
        return iter;
    }
}
