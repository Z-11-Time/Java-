package com.zcc.demo.demo2.io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Dr.Z
 * @version demo
 */
public class demo {
    public static void main(String[] args) {

    }
    @Test
    public void create01() throws IOException {
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        File file = new File(filePath);
        file.createNewFile();
    }
    @Test
    public void create02() throws IOException {
        File parentFile = new File("C:\\Users\\86178\\Desktop\\");
        String filename = "nes2.txt";
        File file = new File(parentFile,filename);
        file.createNewFile();
    }

}
