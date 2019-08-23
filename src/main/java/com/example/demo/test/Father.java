package com.example.demo.test;

import org.apache.lucene.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Father {

    private static final String CLIENT_SPLIT_REGEX = "[\\,，、;]";

    protected void eat() {
        System.out.println("我是father吃");
    }

    protected void eat1() {
        System.out.println("哈哈哈");
    }

    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.eat();
        person2.eat1();
        String str = " ";
        StringBuilder name = new StringBuilder();
        System.out.println(name.toString());
        //System.out.println(str.substring(0,str.length()-1));
    }
}
