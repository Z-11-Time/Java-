package com.zcc.reflection.class_;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Dr.Z
 * @version demo
 */
public class Class_01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        String classPath = "com.zcc.reflection.class_.Car";
        Class<?> cls = Class.forName(classPath);
        Object o = cls.newInstance();
        System.out.println(cls);
        Field brand = cls.getField("brand");
        System.out.println(brand.get(o));
        brand.set(o,"磁性");
        System.out.println(brand.get(o));
        Field[] fields = cls.getFields();
        Method hi = cls.getDeclaredMethod("hi");
        Method hi2 = cls.getMethod("hi2");
        hi.setAccessible(true);
        hi.invoke(null);
        hi2.invoke(o);
        hi.invoke(o);
//        for (Field field :fields) {
//            //字段名称
//            System.out.println(field.getName());
//        }
        //又对象实例
//        Car car = new Car();
//        Class<Car> carClass = Car.class;
//        System.out.println(carClass);
//        System.out.println(cls.getSimpleName());
//        System.out.println(car.getClass());
    }
}