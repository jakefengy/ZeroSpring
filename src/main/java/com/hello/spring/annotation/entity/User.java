package com.hello.spring.annotation.entity;

import org.springframework.stereotype.Component;

/**
 * 2016-10-20. 基本注解，标识了一个受Spring管理的组件
 */
@Component
public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
