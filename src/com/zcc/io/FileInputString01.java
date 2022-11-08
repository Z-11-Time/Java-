package com.zcc.io;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Dr.Z
 * @version demo
 */
public class FileInputString01 {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01() throws IOException {
        int readData = 0;
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        while ((readData = fileInputStream.read())!= -1){
            System.out.print((char) readData);
        }
        fileInputStream.close();
    }
    int readLine = 0;
    @Test
    public void readFile02() throws IOException {
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        byte[] buf = new byte[8];//一次读取8字节
        FileInputStream fileInputStream = new FileInputStream(filePath);
        while ((readLine = fileInputStream.read(buf))!= -1){
            System.out.print(fileInputStream.read(buf));
            //设置读取长度
            System.out.println(new String(buf,0,readLine));
        }
        fileInputStream.close();
    }
}
