package com.hello.spring.autowire;

/**
 * 2016-10-19.
 */
public class Person {

    private String name;
    private Address address;
    private Car autoWireCar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getAutoWireCar() {
        return autoWireCar;
    }

    public void setAutoWireCar(Car autoWireCar) {
        this.autoWireCar = autoWireCar;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", car=" + autoWireCar + "]";
    }
}
