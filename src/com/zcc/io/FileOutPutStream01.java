package com.zcc.io;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Dr.Z
 * @version demo
 */
public class FileOutPutStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile() throws IOException {
        String filePath = "C:\\Users\\86178\\Desktop\\news3.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath,true);
            //写入单个字符
//            fileOutputStream.write('d');
            //写入字符串
            String str = "hello,world!";
            fileOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            fileOutputStream.close();
        }
    }
}