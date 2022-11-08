package com.zcc.io.序列化;

import java.io.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        String filePath1 = "C:\\Users\\86178\\Desktop\\news3.txt";
        String filePath2 = "C:\\Users\\86178\\Desktop\\news1.txt";
        //转换成  转换流
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath1),"utf-16");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath2,true), "utf-8");
        //创建buffered缓冲流
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        String readLine;
        while ((readLine = bufferedReader.readLine())!=null){
            bufferedWriter.write(readLine);
            bufferedWriter.newLine();
        }
        //没有缓冲流
        outputStreamWriter.write("可以直接输入\n");
        bufferedReader.close();
        bufferedWriter.close();
    }
}
