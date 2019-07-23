package com.example.demo.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ytp
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
