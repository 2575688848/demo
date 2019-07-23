package com.example.demo.ch2.event;

import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @author ytp
 */
@Data
public class DemoEvent extends ApplicationContextEvent {

    private String msg;


    /**
     * Create a new ContextStartedEvent.
     *
     * @param source the {@code ApplicationContext} that the event is raised for
     *               (must not be {@code null})
     */
    public DemoEvent(ApplicationContext source, String msg) {
        super(source);
        this.msg = msg;
    }
}
