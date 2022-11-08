package com.zcc.io.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Dr.Z
 * @version demo
 */
public class Properties_ {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\zcc\\demo\\demo2\\io\\properties\\mysql.properties"));
        String line;
        while ((line = bufferedReader.readLine())!=null)
            System.out.println(line);
        bufferedReader.close();
    }
}
