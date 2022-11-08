package com.zcc.io.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Dr.Z
 * @version demo
 */
public class Properties_03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //创建
        //如果有对应的key就修改 内容，没有就创建
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");//保存的是中文的unicode
        properties.setProperty("pwd","1112211");
        //将k-v存储到文件
        // comments是注释
        properties.store(new FileOutputStream("src\\com\\zcc\\demo\\demo2\\io\\properties\\mysql.properties"),"I am the comments");

    }
}
