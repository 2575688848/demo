package com.example.demo.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main (String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = applicationContext.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = applicationContext.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = applicationContext.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = applicationContext.getBean(DemoPrototypeService.class);

        System.out.println(s1.equals(s2));
        System.out.println(p1.equals(p2));
    }
}
