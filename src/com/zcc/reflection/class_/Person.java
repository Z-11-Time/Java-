package com.zcc.reflection.class_;

/**
 * @author Dr.Z
 * @version demo
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private static void hi(){
        System.out.println("hi");
    }
    public void hi2(){
        System.out.println("hi");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
