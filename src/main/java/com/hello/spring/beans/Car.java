package com.hello.spring.beans;

/**
 * 2016-10-19.
 */
public class Car {

    private String name;
    private double price;
    private int maxSpeed;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car = { name: " + name + ", price: " + price + ", maxSpeed: " + maxSpeed + " }";
    }
}
