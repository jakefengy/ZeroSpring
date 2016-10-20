package com.hello.spring.factory;

import java.util.HashMap;

/**
 * 2016-10-20.
 */
public class StaticCarFactory {

    private static HashMap<String, Car> cars = new HashMap<String, Car>();

    static {
        cars.put("audi", new Car("AuDi", 250));
        cars.put("ford", new Car("Ford", 100));
    }


    public static Car getCar(String name) {
        return cars.get(name);
    }
}
