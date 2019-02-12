package com.example.demo.ch1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author ytp
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.example.demo.ch1.Action)")
    public void annotationPointCut() {
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method =  signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("哈哈哈，注解式拦截" + action.name());
    }

    @Before("execution(* com.example.demo.ch1.DemoService.*(..))")
    public void before(JoinPoint joinpoint){
        MethodSignature signature = (MethodSignature) joinpoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法式拦截" + method.getName());
    }
}
