package com.example.demo.Queue;

import java.util.concurrent.BlockingQueue;

/**
 * 阻塞队列实现生产者，消费者
 */
public class Producer implements Runnable {

    private final BlockingQueue blockingQueue;

    public Producer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("生产者：" + i);
                blockingQueue.put(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
