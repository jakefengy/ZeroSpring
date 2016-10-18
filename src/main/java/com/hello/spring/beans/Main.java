package com.hello.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-18.
 */
public class Main {

    public static void main(String[] args) {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("Jone");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-application-config.xml");

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.hello();
    }

}
