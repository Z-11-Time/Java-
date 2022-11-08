package com.zcc.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author Dr.Z
 * @version demo
 */
public class List_ {
    public static void main(String[] args) {
        //List的都可以出现重复元素
        ArrayList<Integer> objects = new ArrayList<>();//线程不安全，扩容1.5倍，可变数组，
        Collections.sort(objects);
        Vector<Person_<String>> people = new Vector<>();//线程安全，扩容2倍，可变数组
        LinkedList<Object> objects1 = new LinkedList<>();//线程不安全，链表追加，双向链表，不能直接定位
    }
}
//自定义泛型类限定数据类型
class Person_<E>{
    private E s;

    public Person_(E s) {
        this.s = s;
    }
}
