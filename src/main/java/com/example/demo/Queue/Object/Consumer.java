package com.example.demo.Queue.Object;

import java.util.PriorityQueue;

public class Consumer extends Thread{

    private final PriorityQueue<Integer> queue;

    public Consumer(PriorityQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == 0) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int i = queue.poll();
                System.out.println("消费者 " + i);
                queue.notify();
            }
        }
    }
}
