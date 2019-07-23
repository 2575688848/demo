package com.example.demo.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ytp
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("我发布了一条信息");
        context.close();
    }
}
