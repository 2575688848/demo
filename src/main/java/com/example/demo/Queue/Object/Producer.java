package com.example.demo.Queue.Object;

import java.util.PriorityQueue;

public class Producer extends Thread {

    private final PriorityQueue<Integer> queue;
    private int i = 0;

    public Producer(PriorityQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == 10) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ++i;
                queue.offer(i);
                System.out.println("生产者 ：" + i);
                queue.notify();
            }
        }
    }
}
