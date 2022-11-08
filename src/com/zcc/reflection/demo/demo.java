package com.zcc.reflection.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Dr.Z
 * @version demo
 */
public class demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //对于配置文件的读取
        Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Users\\86178\\Desktop\\Java实例\\src\\com\\zcc\\reflection\\demo\\filr.properties"));
        String classPath = properties.get("classPath").toString();
        String method  = properties.get("method").toString();
        //以下是反射的内容
        //加载类，返回一个类的class对象
        Class cls = Class.forName(classPath);
        //创建Cat的对象
        Object o = cls.newInstance();
        //创建Cat对象中方法的对象
        Method method1 = cls.getMethod(method);
        Object invoke = method1.invoke(o);
    }
}
