package com.example.demo.thread;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadTest {

    @Test
    public void testThread() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i<3; i++) {
            DemoThread demoThread = new DemoThread();
            demoThread.setI(i);
            Future<Object> future = service.submit(demoThread);
            System.out.println("哈哈 我是 testThread " + future.get());
        }
    }
}
