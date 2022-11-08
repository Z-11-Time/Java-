package com.zcc.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Dr.Z
 * @version demo
 */
public class GenericExercise {
    public static void main(String[] args) {
        //创建对象时候定义泛型
        Person<String> string = new Person<>("String");
        Person<Integer> person = new Person<Integer>(21);
        //在定义了泛型后后面的的调用都会用这个泛型
        ArrayList<String> strings = new ArrayList<>();
        Iterator<String> iterator = strings.iterator();
//      List<Object>list = new ArrayList<String>(); 泛型没有继承
//      但是可以限定泛型传入的参数类型
//      <?><? extends A><? super A>

    }
}
//自定义泛型类限定数据类型
class Person<E>{
    private E s;

    public Person(E s) {
        this.s = s;
    }
}