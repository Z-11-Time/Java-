package com.zcc.io.理解buffered;

/**
 * @author Dr.Z
 * @version demo
 */
public class bad extends demo_00 {
    private demo_00 demo;

    public bad(demo_00 demo) {
        this.demo = demo;
    }
    public void read(){
        demo.method_01();
        demo.method_02();
    }
}
