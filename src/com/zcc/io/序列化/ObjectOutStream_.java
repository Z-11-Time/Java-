package com.zcc.io.序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Dr.Z
 * @version demo
 */
public class ObjectOutStream_ {
    public static void main(String[] args) throws IOException {
        //序列化后，保存的文件的格式不是纯文本的，而是按照他的格式保存
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        //保存对象
        objectOutputStream.writeObject(new Dog_02("母狗",22));
        objectOutputStream.close();
    }
}
class Dog_02 implements Serializable {
    private int age;
    private String name;

    public Dog_02( String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog_02{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
