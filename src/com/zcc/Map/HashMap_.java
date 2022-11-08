package com.zcc.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Dr.Z
 * @version demo
 */
public class HashMap_ {
    public static void main(String[] args) {
        //Map也是数组+链表的储存形式，但是链表是由实现Entry接口的节点组成的EntrySet(包含了数组的那一个节点)
        // EntrySet的结构------->  EntrySet<Map.entry<K,V>>
        //定义泛型的时候是k-v
        //线程不安全
        HashMap map = new HashMap<Integer, String>();
        //用put添加k-v;
        //value可以重复,当key一样时候value会被覆盖
        for (int i = 0; i < 20; i++) {
            map.put(i, "dss");
        }
        map.put(1,"hihi");
        //遍历
        //第一组，通过key遍历
        Set keySet = map.keySet();
        //增强for循环
        for (Object key : keySet) {
            System.out.println(key + "=" + map.get(key));
        }
        //迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }
        //第二组，通过EntrySet来遍历（能使用Entry的方法）
        //加入泛型能省去向下转型的过程
        Set<Map.Entry> entrySet = map.entrySet();
        //增强for循环
        for (Map.Entry entry : entrySet) {
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }
        //迭代器
        Iterator<Map.Entry> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry entry = iterator1.next();
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }
    }
}
