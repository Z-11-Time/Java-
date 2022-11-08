package com.zcc.io.理解buffered;

/**
 * @author Dr.Z
 * @version demo
 */
public class Text_00{
    public static void main(String[] args) {
        demo_00 demo_00 = new demo_01();
        bad bad0 = new bad(demo_00);
        bad bad1 = new bad(new demo_02());
        //直接去调用    ××  行不通
        //这样调用的是demo_00的方法
        bad0.method_01();
        bad1.method_02();
        //只能通过bad内的方法去调用其他类的方法
        //只能在封装之后调用
        //这也是多态的一种体现
        bad0.read();
        bad1.read();
    }
}
