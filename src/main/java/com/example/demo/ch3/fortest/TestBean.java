package com.example.demo.ch3.fortest;

import lombok.Data;

/**
 * @author ytp
 */

@Data
public class TestBean {

    private String content;

    public TestBean(String content) {
        this.content = content;
    }
}
