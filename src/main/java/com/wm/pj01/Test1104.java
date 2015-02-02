package com.wm.pj01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by wm on 14-11-4.
 */
public class Test1104 {
    public static void main(String[] args) {
        Integer [] a={34,23,72,56,213,46,24,65,98,26};
        InsertSort<Integer> sort=new InsertSort<Integer>();
//        sort.insertSort(a);
        Integer []b={48,56,72,23,32};
//        Integer []b={48,56,72};
//        sort.oneMergeSort(b,0,2,b.length-1);
//        sort.quickSort(a,0,a.length-1);
//        sort.mergeSort(b,0,2);
//        sort.MSort(a);
//        sort.SectionSort(a);
        Collections.shuffle(Arrays.asList(a),new Random());
//        sort.BubbleSort(a);
        for(int t:a){
            System.out.println(t);
        }
    }
}
