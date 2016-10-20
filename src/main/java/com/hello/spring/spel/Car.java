package com.hello.spring.spel;

/**
 * 2016-10-19.
 */
public class Car {

    private String name;
    private double price;
    private double perimeter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", price=" + price + ", perimeter=" + perimeter + "]";
    }
}
