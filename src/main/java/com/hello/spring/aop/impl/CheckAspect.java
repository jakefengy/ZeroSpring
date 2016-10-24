package com.hello.spring.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 2016-10-24. 验证切面
 */
@Order(2)
@Component
@Aspect
public class CheckAspect {

    @Before("LoggerAspect.joinPointExpression()")
    public void beforeLogger(JoinPoint point) {

        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());

        System.out.println("------> CheckAspect " + methodName + " before, with" + args);

    }

}
