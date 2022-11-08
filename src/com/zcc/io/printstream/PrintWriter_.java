package com.zcc.io.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Dr.Z
 * @version demo
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        //设置了输出位置
        PrintWriter printWriter1 = new PrintWriter(new FileWriter("C:\\Users\\86178\\Desktop\\news1.txt"));
        //改为显示器
        PrintWriter printWriter2 = new PrintWriter(System.out);
//        printWriter2.write("zcc就是可以这样");
//        printWriter2.close();
    }
}
