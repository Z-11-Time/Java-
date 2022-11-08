package com.zcc.io;

import java.io.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class BufferedWriter_01 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("你好，母狗\n");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String lineData;
        while ((lineData= bufferedReader.readLine())!=null){
            System.out.println(lineData);
        }

    }
}
