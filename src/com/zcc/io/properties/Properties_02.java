package com.zcc.io.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Dr.Z
 * @version demo
 */
public class Properties_02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\com\\zcc\\demo\\demo2\\io\\properties\\mysql.properties"));
        //显示(输出)
        properties.list(System.out);
        //根据key获取对应的值
        String user = properties.getProperty("user");
        System.out.println("用户名" + user);
    }
}
