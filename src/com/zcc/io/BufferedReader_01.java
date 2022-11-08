package com.zcc.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Dr.Z
 * @version demo
 */
public class BufferedReader_01 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        //创建
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
