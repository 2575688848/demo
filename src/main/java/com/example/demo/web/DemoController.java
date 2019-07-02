package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tomcat")
public class DemoController {

    @GetMapping("/hello")
    public String getHello() {
        return  "ahah";
    }
}
