package com.example.demo.ch3.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author icourt
 */

@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devBean() {
        return new TestBean("devBean");
    }

    @Bean
    @Profile("prod")
    public TestBean prodBean() {
        return new TestBean("prodBean");
    }
}
