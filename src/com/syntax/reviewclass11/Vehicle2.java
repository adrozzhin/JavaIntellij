package com.syntax.reviewclass11;

public abstract class Vehicle2 {
    String name;
    static int registrationNumber;

    public Vehicle2(String name) {
        this.name = name;
        registrationNumber++;
    }

    abstract void speedOfVehicle();
    static void displayTheNameOfTheVehicle() {
        System.out.println("Vehicle numbers are: " + registrationNumber);
    }

    public void color() {
        System.out.println("Color of the vehicle is black");
    }

    protected void price() {
        System.out.println("Its in budget");
    }
}
abstract class Car extends Vehicle2 {

    String model;
    public Car(String name, String model) {
        super(name);
        this.model = model;
    }

    public void speedOfVehicle() {
        System.out.println("Speed can be tested in this class");
    }

    public abstract void breakMyCar();
}

class Byk extends Car {

    String color;

    public Byk(String name, String model, String color) {
        super(name, model);
        this.color = color;
    }

    @Override
    public void breakMyCar() {
        System.out.println("Breaking the car here");
    }
}
