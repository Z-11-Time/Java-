package com.zcc.io;

import java.io.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class BufferedCopy_01 {
    public static void main(String[] args) throws IOException {
        String inFilePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        String outFilePath = "C:\\Users\\86178\\Desktop\\news3.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFilePath,true));
        //用line去读写
        String lineData;
        while ((lineData = bufferedReader.readLine())!=null){
            //读取一行(但不会读取换行符)
            bufferedWriter.write(lineData);
            //必须写入换行，不然会写在同一行
            bufferedWriter.newLine();
        }
        //用char去读写
        char[] chars = new char[10];
        int charLen;
        while ((charLen = bufferedReader.read(chars))!=-1){
            //必须设置长度,不然会出错
            bufferedWriter.write(chars,0,charLen);
        }
        if (bufferedReader != null)
            bufferedReader.close();
        if (bufferedWriter != null)
            bufferedWriter.close();
    }
}
