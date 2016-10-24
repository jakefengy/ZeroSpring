package com.hello.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-24.
 */
public class Main {

    public static void main(String... a) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc-config.xml");

    }

}
