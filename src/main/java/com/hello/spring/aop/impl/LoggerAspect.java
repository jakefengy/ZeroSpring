package com.hello.spring.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 首先声明该类是IOC容器中的bean，其次标记该类是一个切面
 */
@Component
@Aspect
public class LoggerAspect {

    @Before("execution(public int com.hello.spring.aop.impl.ArithmeticImpl.*(..))")
    public void beforeLogger(JoinPoint point) {

        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());

        System.out.println("aspect before " + methodName + " , " + args);

    }

}
