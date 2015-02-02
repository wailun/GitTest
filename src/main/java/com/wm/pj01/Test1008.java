package com.wm.pj01;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by wm on 14-10-8.
 */
public class Test1008 {
//    Thread thread=new Thread(new RunnableTest());
public static void main(String[] args) throws InterruptedException {
    Executors.newCachedThreadPool().submit(new CallableTest());
    Thread thread=new Thread(new RunnableTest());
    thread.join();
}
}
class CallableTest implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("callableTest");
        return "success";
    }
}
class RunnableTest implements Runnable{

    @Override
    public void run() {
        System.out.println("RunnableTest");
    }
}
