package com.zcc.io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Dr.Z
 * @version demo
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    //获取文件信息
    public void info() throws IOException {
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        File file = new File(filePath);
        file.createNewFile();
        //调用相应的方法
        System.out.println("文件名字" + file.getName());
        System.out.println("是不是文件目录" + file.isDirectory());
    }
    @Test
    public void m1(){
        String filePath = "C:\\Users\\86178\\Desktop\\dd";
        File file = new File(filePath);
        if (file.exists()){//两个返回的类型都是boolean所以可以判定
            if (file.delete() == true){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("文件不存在");
        }
    }
}
