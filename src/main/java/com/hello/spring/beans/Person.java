package com.hello.spring.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2016-10-19.
 */
public class Person {

    private String name;
    private int age;
    private List<Car> cars;
    private Map carMap;

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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Map getCarMap() {
        return carMap;
    }

    public void setCarMap(Map carMap) {
        this.carMap = carMap;
    }

    @Override
    public String toString() {
        return "Person = { name: " + name + ", age: " + age + ", cars: " + cars + ", carMap: " + carMap + " }";
    }

}
