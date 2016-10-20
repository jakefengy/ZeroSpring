package com.hello.spring.cycle;

/**
 * 2016-10-20.
 */
public class LifeCycle {

    private String name;

    public LifeCycle() {
        System.out.println("LifeCycle's Constructor...");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName..." + name);
    }

    public void init() {
        System.out.println("init...");
    }

    public void destroy() {
        System.out.println("destroy...");
    }

    @Override
    public String toString() {
        return "LifeCycle [name=" + name + "]";
    }

}
