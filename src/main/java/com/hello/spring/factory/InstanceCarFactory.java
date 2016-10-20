package com.hello.spring.factory;

import java.util.HashMap;

/**
 * 2016-10-20. 实例工厂方法
 */
public class InstanceCarFactory {

    private HashMap<String, Car> cars = new HashMap<String, Car>();

    public InstanceCarFactory() {

        cars.put("audi", new Car("AuDi", 250));
        cars.put("ford", new Car("Ford", 100));

    }

    public Car getCar(String name) {
        return cars.get(name);
    }
}
