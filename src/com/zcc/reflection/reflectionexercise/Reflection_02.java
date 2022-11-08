package com.zcc.reflection.reflectionexercise;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Dr.Z
 * @version demo
 */
public class Reflection_02 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.zcc.reflection.reflectionexercise.PrivateTest");
        Object o = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"1234");
        Method getName = aClass.getMethod("getName");
        Object invoke = getName.invoke(o);
        System.out.println(invoke);
    }
}
