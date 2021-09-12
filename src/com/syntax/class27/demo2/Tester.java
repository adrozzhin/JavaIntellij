package com.syntax.class27.demo2;

public class Tester {
    public static void main(String[] args) {
        Car car = new Mercedes();
        car.start();
        car.stop();

        Mercedes mercedes = new Mercedes();
        mercedes.drive();
    }
}
