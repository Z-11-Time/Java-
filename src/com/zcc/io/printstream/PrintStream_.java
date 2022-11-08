package com.zcc.io.printstream;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * @author Dr.Z
 * @version demo
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        System.out.println();
        out.write("zcc就是可以这样".getBytes(StandardCharsets.UTF_8));
        //设置打印流输出的位置
        System.setOut(new PrintStream("C:\\Users\\86178\\Desktop\\news1.txt"));
        System.out.println("haha,我换位置了");
        out.close();
    }
}
