package com.hello.spring.spel;

/**
 * 2016-10-19.
 */
public class Person {

    private String name;
    private String street;
    private Car car;

    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", street=" + street + ", car=" + car + ", info=" + info + "]";
    }
}
