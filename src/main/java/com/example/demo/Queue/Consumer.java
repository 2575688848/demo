package com.example.demo.Queue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int i= (Integer) blockingQueue.take();
                System.out.println("消费者 消费" + i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
