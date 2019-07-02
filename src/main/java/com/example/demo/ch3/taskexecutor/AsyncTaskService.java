package com.example.demo.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author ytp
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("任务 ：" + i);
    }

    @Async
    public void executeAsyncTaskAddOne(Integer i) {
        System.out.println("任务+1：" + (i + 1));
    }

}
