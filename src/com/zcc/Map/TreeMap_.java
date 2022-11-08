package com.zcc.Map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Dr.Z
 * @version demo
 */
public class TreeMap_ {
    public static void main(String[] args) {
        //我们如果创建的对象如果不符合下面的标准会直接报错
        //存放的TreeSet集合的元素，必须是自然顺序或比较方法
        TreeMap<Object, Object> TreeMap = new TreeMap<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照传入的String的长度比较
                return ((String)o1).length()-((String)o2).length();
            }
        });
        //用put方法添加元素,且添加的是键值对
        // 出现重复的就不添加
        TreeMap.put(01,"");
    }
}
