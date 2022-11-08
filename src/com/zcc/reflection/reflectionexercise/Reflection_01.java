package com.zcc.reflection.reflectionexercise;

import com.zcc.reflection.class_.Class_01;
import com.zcc.reflection.demo.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Dr.Z
 * @version demo
 */
@SuppressWarnings({"all"})
public class Reflection_01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.zcc.reflection.demo.Cat");
        int maxnum = 1000;
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < maxnum; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();

        //用对象调用方法
        Cat cat = new Cat();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < maxnum; i++) {
            cat.hi();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("输出反射的运行时间:" + (end - start));
        System.out.println("输出正常的运行时间:" + (end1 - start1));
    }
}
