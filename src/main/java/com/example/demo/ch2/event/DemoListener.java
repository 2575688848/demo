package com.example.demo.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ytp
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {


    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我接受到了信息" + msg);
    }
}
