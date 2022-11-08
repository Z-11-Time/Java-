package com.zcc.io;

import java.io.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class BufferedCopy_02 {
    public static void main(String[] args) throws IOException {
        String inFilePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        String outFilePath = "C:\\Users\\86178\\Desktop\\news3.txt";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inFilePath));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outFilePath));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,len);
        }
        if (bufferedInputStream != null)
            bufferedInputStream.close();
        if (bufferedOutputStream!=null)
            bufferedOutputStream.close();
    }
}
