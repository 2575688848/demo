package com.example.demo.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestWithBlocking {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new LinkedBlockingQueue();
        Consumer consumer = new Consumer(blockingQueue);
        Producer producer = new Producer(blockingQueue);
        new Thread(consumer).start();
        new Thread(producer).start();
    }
}
