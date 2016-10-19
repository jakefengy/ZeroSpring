package com.hello.spring.relation;

import com.hello.spring.autowire.Address;
import com.hello.spring.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-19.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-relation.xml");

//        Address address = (Address) ctx.getBean("address");
//        System.out.println(address);

        Address address = (Address) ctx.getBean("addressParent");
        System.out.println(address);

        Person person = (Person) ctx.getBean("personDepend");
        System.out.println(person);

    }

}
