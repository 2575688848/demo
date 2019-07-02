package com.example.demo.reflect;

public class Person {

    private int age;
    private String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void getPerson() {
        System.out.println("i am a person");
    }

    public void fly() {
        System.out.println("超人会飞耶～～");
    }

    public void walk(int m) {
        System.out.println("超人会走耶～～走了" + m + "米就走不动了！");
    }

}
