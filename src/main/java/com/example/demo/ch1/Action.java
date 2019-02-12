package com.example.demo.ch1;


import java.lang.annotation.*;

/**
 * @author ytp
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
    String name();
}
