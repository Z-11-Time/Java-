package com.zcc.reflection.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author Dr.Z
 * @version demo
 */
public class ReflrctionMethod {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.zcc.reflection.class_.Person");
//        Object o = aClass.newInstance();//通过无参构造器
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Object o1 = constructor.newInstance("zz",15 );
        Method hi = aClass.getDeclaredMethod("hi");
        hi.setAccessible(true);
        hi.invoke(o1);
        System.out.println(o1);
    }
}
