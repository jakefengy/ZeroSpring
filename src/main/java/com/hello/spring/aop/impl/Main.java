package com.hello.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-21.
 */
public class Main {

    public static void main(String... args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-aop.xml");

        Arithmetic arithmetic = (Arithmetic) ctx.getBean("arithmeticImpl");

        int result = arithmetic.add(1, 2);
        System.out.println(result);

        result = arithmetic.mul(1, 2, 3);
        System.out.println(result);

    }

}
