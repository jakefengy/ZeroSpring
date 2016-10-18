package com.hello.spring.beans;

/**
 * 2016-10-18.
 */
public class HelloWorld {

    private String name;

    public HelloWorld() {
        System.out.println("HelloWorld 构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName " + name);
    }

    public void hello() {
        System.out.println("Hello " + name);
    }

}
