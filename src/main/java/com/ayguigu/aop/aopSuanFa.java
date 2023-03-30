package com.ayguigu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aopSuanFa {
    @Before("execution(* com.ayguigu.aop.*.*(..))")
    public void beforeMessage(){
        System.out.println("前置通知");
    }
}
