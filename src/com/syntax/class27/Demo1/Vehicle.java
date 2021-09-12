package com.syntax.class27.Demo1;

public abstract class Vehicle {
    String vinNumber;
    static int totalNumberOfVehicles;
    Vehicle(String vinNumber) {
        this.vinNumber = vinNumber;
    }
    private void display() {

    }
    static void displayTotalVehicles() {
        System.out.println("We build " + totalNumberOfVehicles+ " vehicles");
    }
    public void drive() {
        System.out.println("we can drive Vehicle");
    }
    protected void stop() {
        System.out.println("Vehicle can stop");
    }
    public abstract void start();
    abstract void speed();
}
abstract class Car extends Vehicle{
    String carType;
    Car (String carType, String vinNumber) {
        super(vinNumber);
        this.carType=carType;
        System.out.println("Car constructor");
    }
    @Override
    public void speed() {
        System.out.println("Max speed is 400");
    }
    public abstract void breaking();
}

