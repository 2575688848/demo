package com.example.demo.thread;

import lombok.Data;

import java.util.concurrent.Callable;

@Data
public class DemoThread implements Callable<Object> {

    private int i;

    @Override
    public Object call() throws Exception {
        System.out.println("哈哈 我是 demoThread" + i);
        return i;
    }
}
