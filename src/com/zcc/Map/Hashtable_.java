package com.zcc.Map;

/**
 * @author Dr.Z
 * @version demo
 */
public class Hashtable_ {
    public static void main(String[] args) {
        //Hashtable操作几乎和HashMap一样，但是线程安全，每个方法都上锁，但是还效率太低
        //hashtable不允许键或值为null
        // HashTable底层数组长度可以为任意值，这就造成了hash算法散射不均匀，容易造成hash冲突，默认为11；
    }
}
