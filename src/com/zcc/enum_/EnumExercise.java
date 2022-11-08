package com.zcc.enum_;

/**
 * @author Dr.Z
 * @version demo
 */
public class EnumExercise {
    public static void main(String[] args) {
        //建立对象数组
        Person[] values = Person.values();

        for (Person value : values) {
            //如果没有重写toString返回的是对象名
            //重写之后返回的是对象的值
            System.out.println(value);
        }
        System.out.println();
    }
}
enum Person{
    MAN("鲁怡单",21),WOMON("11",11);
    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}