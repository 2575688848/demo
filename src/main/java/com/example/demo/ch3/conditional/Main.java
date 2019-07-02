package com.example.demo.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author icourt
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        System.out.println("哈哈哈" + context.getEnvironment().getProperty("os.name"));
        ListService listService = context.getBean(ListService.class);
        System.out.println(listService.showListCmd());
    }

}
