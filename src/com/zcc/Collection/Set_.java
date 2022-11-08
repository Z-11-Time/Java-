package com.zcc.Collection;

import com.zcc.demo.LinkedHashSet;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Dr.Z
 * @version demo
 */
public class Set_ {
    public static void main(String[] args) {
        //Set的且不能出现重复的元素，输入输出顺序可能不一样，看链表是单向的双向的
        //Set的存储结构是数组+链表
        //所以判定是否一样的有两个步骤(hash()+equals())
        //太多展示不出来，看书
        HashSet<Object> objects = new HashSet<>();//单向链表，是无序的，输出和输入的顺序不一样，
        LinkedHashSet linkedHashSet = new LinkedHashSet();//双向链表链接上下节点，有序，输出和输入的顺序一样
        objects.add("01");
    }
}
class HashSet_{
    private String name;

    public HashSet_(String name) {
        this.name = name;
    }
    //值一样就hash值一样，而不是看地址
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    //判定条件改变，值一样就是true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashSet_ hashSet_ = (HashSet_) o;
        return Objects.equals(name, hashSet_.name);
    }
}