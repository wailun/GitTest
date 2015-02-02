package com.wm.pj01;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.*;

/**
 * Created by wm on 14-9-29.
 */
public class Test0929 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Collection<Integer> set=new HashSet<Integer>() ;
        File file = new File("src/main/file.dat");
        Integer i=new Integer(1);
//        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(file));
       // os.writeObject(i);
        T0929 t1=new T0929(1);
        List<T0929> list = new ArrayList<T0929>();
        list.add(t1);
        List<T0929> subList = list.subList(0, 1);
        Collections.copy(list,subList);
        list.listIterator();
        FileInputStream fileInputStream=new FileInputStream(file);
        FileChannel channel=fileInputStream.getChannel();
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        Selector acceptSelector =  SelectorProvider.provider().openSelector();

//        os.writeObject(list);
//        os.close();
//        ObjectInputStream oi=new ObjectInputStream(new FileInputStream(file));
//        Integer k=(Integer)oi.readObject();
//        System.out.println(k+1);
//        oi.close();
        TreeSet<Integer> ts=new TreeSet<Integer>(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<02) return -1;
                else return 1;
            }
        });
    }
}
class T0929 implements Serializable{
    private  int i;
    T0929(int i){

    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}
