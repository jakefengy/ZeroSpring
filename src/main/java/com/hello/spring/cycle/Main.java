package com.hello.spring.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-20.
 */
public class Main {

    public static void main(String... a) {


        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-life-cycle.xml");

        LifeCycle cycle = (LifeCycle) ctx.getBean("cycle");
        System.out.println(cycle);

        ctx.close();

    }

}
