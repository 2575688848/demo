package com.example.demo.ch1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author icourt
 */
public class Main {

    public static void main (String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoAnnotationService.add();
        demoService.add();
        context.close();
    }
}
