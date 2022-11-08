package com.zcc.io.exercise;

import java.io.*;
import java.util.Properties;

/**
 * @author Dr.Z
 * @version demo
 */
public class HomeWork_03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\com\\zcc\\demo\\demo2\\io\\exercise\\dog.properties"));

        //用properties的方法去调用
        Dog dog = new Dog(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")), properties.getProperty("color"));
        System.out.println(dog);
//        new ObjectWriter(new FileWriter("C:\\Users\\86178\\Desktop\\mytemp\\hello.txt"))
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\86178\\Desktop\\mytemp\\hello.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\86178\\Desktop\\mytemp\\hello.txt"));
        objectOutputStream.writeObject(dog);

        System.out.println(objectInputStream.readObject());
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}