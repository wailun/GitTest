package com.wm.pj01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by wm on 14-10-30.
 */
public class Test1031 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<10;++i){
            list.add((int)(Math.random()*10));
        }
        for(int i=0;i<list.size();++i){
            if(list.get(i)%2==0){
                list.remove(i);
            }

//            i--;
        }
        System.out.println(list);
    }
}
