package com.zcc.io.exercise;

import java.io.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class HomeWork_01 {
    public static void main(String[] args) throws IOException {
        String fileDirectoryPath = "C:\\Users\\86178\\Desktop\\mytemp\\";
//        File file = new File(fileDirectoryPath);
        String filePath;
//        if (!file.exists()){
//            file.mkdir();
            filePath ="C:\\Users\\86178\\Desktop\\mytemp\\hello.txt";
//            File file1 = new File(fileDirectoryPath,filePath);
//            file1.createNewFile();
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));
//            bufferedOutputStream.write(("hello,world").getBytes(StandardCharsets.UTF_8));
//            bufferedOutputStream.close();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write("hello,world");
            bufferedWriter.newLine();
            bufferedWriter.close();
            //读取
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\86178\\Desktop\\mytemp\\hello.txt"));
            System.out.println(bufferedReader.readLine());
//        }

    }
}
