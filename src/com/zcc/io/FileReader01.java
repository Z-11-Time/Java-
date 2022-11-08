package com.zcc.io;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Dr.Z
 * @version demo
 */
public class FileReader01 {
    public static void main(String[] args) {

    }
    @Test
    public void read01() throws IOException {
        FileReader fileReader = null;
        int readLen = 0;
        char[] chars = new char[32];
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        try {

            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(chars))!=-1){
                System.out.print(new String(chars,0,readLen));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            fileReader.close();
        }
    }
    @Test
    public void write01() throws IOException {
        FileWriter fileWriter = null;
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        try {
            fileWriter = new FileWriter(filePath,true);
            fileWriter.write("母狗给我跪着");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileWriter.close();
        }
    }
}
