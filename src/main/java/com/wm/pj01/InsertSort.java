package com.wm.pj01;


import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import sun.jvm.hotspot.runtime.VM;
import sun.security.util.Length;

import java.util.Arrays;

/**
 * Created by wm on 14-11-4.
 */
public class InsertSort<T extends Comparable> {

//    插入排序
    T[] insertSort(T[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i].compareTo(a[j]) > 0) {
                    swap(a, i, j);
                }
            }
        }
        return a;
    }
//快速排序
    T[] quickSort(T[] a, int low, int high) {
        int mid = oneQuickSort(a, low, high);
        if (mid > low && mid < high) {
            oneQuickSort(a, low, mid - 1);
            oneQuickSort(a, mid + 1, high);
        }
        return a;
    }
//归并排序
    T[] MSort(T[] a) {
        int mid=a.length>>1;
        for(int i=0;i<=mid;++i){
            mergeSort(a,0, (int)Math.pow(2,i));
        }
        return a;
    }
//选择排序
    T[] SectionSort(T[] a){
        int min;
        for(int i=0;i<a.length;++i){
            min=i;
            for(int j=i+1;j<a.length;++j){
                if(a[j].compareTo(a[min])<0){
                    min=j;
                }
            }
            if(i!=min){
                swap(a,i,min);
            }
        }
        return a;
    }
//    冒泡排序
    T[] BubbleSort(T[] a){
        for(int i=0;i<a.length;++i){
            //一趟气泡
            for(int j=0;j<a.length-i-1;++j){
                if(a[j].compareTo(a[j+1])>0){
                    swap(a,j,j+1);
                }
            }
        }
        return a;
    }


    T[] mergeSort(T[] a, int start, int step) {
        int len =a.length;
        int s = start + step;
        int n = start + 2 * step - 1;
        while (s < len && n < len) {
            oneMergeSort(a, start, s, n);
            start += step * 2;
            s += step * 2;
            n += step * 2;
        }
        if (s < len && n >= len) {
            oneMergeSort(a, start, s, len - 1);
        }
        return a;
    }



    void oneMergeSort(T[] a, int m, int s, int n) {
        int i = m;
        int j = s;
        T[] tmp = Arrays.copyOfRange(a,m,n+1);
        int k = 0;
        while (i < s && j <= n) {
            if (a[i].compareTo(a[j]) < 0) {
                tmp[k++] = a[i];
                i++;
            } else {
                tmp[k++] = a[j];
                j++;
            }
            if (i >= s) {
                while (j < n) {
                    tmp[k++] = a[j++];
                }
            }
            if (j > n) {
                while (i < s) {
                    tmp[k++] = a[i++];
                }
            }
        }
        System.arraycopy(tmp, 0, a, m, tmp.length);
    }

    private int oneQuickSort(T[] a, int low, int high) {
        if (low < high) {
            T t = a[low];
            boolean flag = true;
            while (low < high) {
                if (flag) {
                    if (a[high].compareTo(t) < 0) {
                        a[low] = a[high];
                        low++;
                        flag = false;
                        break;
                    } else {
                        high--;
                    }
                }
                if (!flag) {
                    if (a[low].compareTo(t) > 0) {
                        a[high] = a[low];
                        high--;
                        flag = true;
                        break;
                    } else {
                        low++;
                    }
                }
            }
            a[low] = t;
        }
        return low;
    }

    private void swap(T[] a, int x, int y) {
        T t = a[x];
        a[x] = a[y];
        a[y] = t;
    }
}
