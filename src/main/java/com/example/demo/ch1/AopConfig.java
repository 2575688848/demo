package com.example.demo.ch1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author ytp
 */
@Configuration
@ComponentScan("com.example.demo.ch1")
@EnableAspectJAutoProxy
public class AopConfig {
}
