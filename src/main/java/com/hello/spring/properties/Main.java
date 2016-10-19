package com.hello.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 2016-10-19.
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-properties.xml");

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");

        System.out.println(dataSource.getConnection());

    }

}
