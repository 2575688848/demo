package com.example.demo.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author ytp
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
