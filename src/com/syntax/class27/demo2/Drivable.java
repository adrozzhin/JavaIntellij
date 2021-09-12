package com.syntax.class27.demo2;

public interface Drivable {
    boolean FAST = true;

    void drive();
}

abstract class Car {
    public void stop() {
        System.out.println("A car can stop");
    }

    public abstract void start();
}
class Mercedes extends Car implements Drivable{

    @Override
    public void drive() {
        System.out.println("Mercedes can drive");
    }

    @Override
    public void start() {
        System.out.println("Mercedes can start");
    }
}