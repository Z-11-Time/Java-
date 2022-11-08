package com.zcc.io.序列化;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Dr.Z
 * @version demo
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        String filePath = "C:\\Users\\86178\\Desktop\\news1.txt";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        //这里读取出来的类是Object类
        Object dog = objectInputStream.readObject();
        //向下转型
        Dog_02 dog_02 = (Dog_02)dog;
        dog_02.toString();
        System.out.println(dog);
        objectInputStream.close();
    }
}
class scanner implements Serializable {

}
