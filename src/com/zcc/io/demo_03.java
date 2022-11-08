package com.zcc.io;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dr.Z
 * @version demo
 */
public class demo_03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ok.txt");
        list.add("hello.jpg");
        list.add("day01.rar");
        list.add("world.jpg");
        list.add("no.txt");
        List<String> subList = list.subList(1, 4);
        System.out.println(subList);
        //子集中以“jpg”结尾的元素的后缀都替换成“png”;
        for (int i = 0; i < subList.size(); i++) {
            if (subList.get(i).endsWith("jpg")) {
                subList.set(i, subList.get(i).replace("jpg", "png"));
            }
        }
        System.out.println(subList);
        System.out.println(list);
    }
}
