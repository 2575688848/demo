package com.example.demo.ch1;

import org.springframework.stereotype.Service;

/**
 * @author ytp
 */
@Service
public class DemoAnnotationService {

    @Action(name = "哈哈哈，我是Action注解")
    public void add() {
        System.out.println("哈哈哈，我是DemoAnnotationService的add");
    }
}
