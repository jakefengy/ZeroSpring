package com.hello.spring.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 首先声明该类是IOC容器中的bean，其次标记该类是一个切面
 */
@Order(1)
@Component
@Aspect
public class LoggerAspect {

    @Pointcut("execution(public int com.hello.spring.aop.impl.ArithmeticImpl.*(..))")
    public void joinPointExpression() {

    }


    // 前置通知
    @Before("joinPointExpression()")
    public void beforeLogger(JoinPoint point) {

        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());

        System.out.println("The Method " + methodName + " before, with" + args);

    }

    @After("joinPointExpression()")
    public void afterLogger(JoinPoint point) {

        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());

        System.out.println("The Method " + methodName + " ends");

    }

    @AfterReturning(value = "joinPointExpression()", returning = "result")
    public void afterReturning(JoinPoint point, Object result) {

        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());

        System.out.println("The Method " + methodName + " with AfterReturning " + result);

    }

    @AfterThrowing(value = "joinPointExpression()", throwing = "result")
    public void afterThrowing(JoinPoint point, Exception result) {

        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());

        System.out.println("The Method " + methodName + " with AfterThrowing " + result);

    }

    //    @Around(value = "execution(* com.hello.spring.aop.impl.ArithmeticImpl.*(..))")
    public Object around(ProceedingJoinPoint point) {

        Object result = null;
        String methodName = point.getSignature().getName();

        try {
            // 前置通知
            System.out.println("The Method " + methodName + " begins with " + Arrays.asList(point.getArgs()));
            result = point.proceed();
            // 返回通知
            System.out.println("The Method " + methodName + " return " + result);
        } catch (Throwable e) {
            // 异常通知
            System.out.println("The Method " + methodName + " exception " + e);
            throw new RuntimeException(e);
        }

        // 后置通知
        System.out.println("The Method " + methodName + " ends");

        return result;

    }


}
