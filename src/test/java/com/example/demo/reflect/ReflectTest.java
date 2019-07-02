package com.example.demo.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {

    public static void main(String[] args) throws Exception {

        Class<?> class1 = null;
        class1 = Class.forName("com.example.demo.reflect.Person");
        Person person = (Person) class1.newInstance();
        //getDeclaredField 可以获取所有的字段
        Field nameField = class1.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(person, "姚太平");
        System.out.println("名字 " + person.getName());
        Method walkMethod = class1.getDeclaredMethod("walk", Integer.TYPE);
        walkMethod.invoke(person, 3);



    }
}
