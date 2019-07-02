package com.example.demo.ch2.profile;

import lombok.Data;

/**
 * @author ytp
 */
@Data
public class DemoBean {

    private String content;

    public DemoBean(String content) {
        super();
        this.content = content;
    }

}
