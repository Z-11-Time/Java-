package com.zcc.io;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Dr.Z
 * @version demo
 */
public class demo_02 {
    public static void main(String[] args) {
        ArrayList<String> stringsIn = new ArrayList<>();
        ArrayList<String> stringsOut = new ArrayList<>();
        stringsIn.add("ok.txt");
        stringsIn.add("hello.jpg");
        stringsIn.add("day01.rar");
        stringsIn.add("world.jpg");
        stringsIn.add("no.txt");
        Iterator<String> iterator = stringsIn.iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
            if (next == "hello.jpg" ||next == "day01.rar"||next == "world.jpg")
                stringsOut.add(next);
        }
        for (int i = 0; i < stringsOut.size(); i++) {
            if (stringsOut.get(i).endsWith("jpg")) {
                stringsOut.set(i, stringsOut.get(i).replace("jpg", "png"));
            }
        }
        System.out.println(stringsOut);
        System.out.println(stringsIn);
        String s = new String("hello");
        String t = new String("hello");
        System.out.println(s.equals(t));

    }
}
