package com.example.demo.Queue.Object;

import java.util.PriorityQueue;

/**
 * 测试Object的wait和notify
 */
public class TestWithObject {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        new Consumer(queue).start();
        new Producer(queue).start();
    }
}

