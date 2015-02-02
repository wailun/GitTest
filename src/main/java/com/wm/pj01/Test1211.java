package com.wm.pj01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wm on 14-12-11.
 */
public class Test1211 {
    public static void main(String[] args) {
        List<Integer>  list=new ArrayList<Integer>();
        for(int i=0;i<10;++i){
            list.add(i);
        }
        System.out.println(list.size());
        List<Integer> des=new ArrayList<Integer>();

        for(int i=0;i<list.size();++i){
            des.add(list.get(i));
        }
        System.out.println(des);

    }
}
