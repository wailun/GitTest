package com.wm.pj01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wm on 14-8-31.
 */
public class GitTest {
    public static void main(String[] args) throws  IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
try {
    Class<?> clazz = Class.forName("com.wm.pj01.Unicode");

        Unicode instance = (Unicode) clazz.newInstance();
        Method method=clazz.getDeclaredMethod("getBytes",String.class);
        System.out.println(method.invoke(instance,"中国人"));
}catch (Exception e){
    System.out.println(e.toString());
}
    }

    public static int compute() throws MyException{
        int a[] = {0, 1, 2, 3};
        int c = 10;
        int sum = 0;
        for (int i = a.length; i >=0; --i) {
            try {
                System.out.println(c / a[i]);
            } catch (Exception e) {
                throw new MyException(e.getMessage());
            }
        }
        System.out.println("ok");
        System.out.println(67+89);
        return c;
    }

}
