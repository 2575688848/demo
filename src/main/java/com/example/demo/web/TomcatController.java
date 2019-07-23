package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ytp
 */
@RestController
@RequestMapping("/tomcat")
public class TomcatController {

    @GetMapping("/helloWord")
    public String getHelloWord() {
        return "哈哈哈，傻逼";
    }
}
