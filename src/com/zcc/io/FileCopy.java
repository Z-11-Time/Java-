package com.zcc.io;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Dr.Z
 * @version demo
 */
public class FileCopy {
    public static void main(String[] args) {
        //图片的拷贝
        //思路分析
        //1，创建输入流
        //2.创建输出流
    }


    @Test
    public void picture() throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int readLn = 0;
        //图片和音乐都是由字节组成的二进制文件
        //定义字节数组，提高读取效率
        byte[] buf = new byte[1024];
        String infilePath = "C:\\Users\\86178\\Desktop\\屏幕截图(59).png";
        String outfilePath = "C:\\Users\\86178\\Desktop\\屏幕截图(23).png";
        try {
            fileInputStream = new FileInputStream(infilePath);
            fileOutputStream = new FileOutputStream(outfilePath);
            while ((readLn = fileInputStream.read(buf))!= -1) {
                //只读取有数值的数组，如果
                fileOutputStream.write(buf,0,readLn);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("拷贝成功");
    }
}
