package com.syntax.class18;

public class Car {
    String model;
    String make;
    int year;
    String color;

    Car(String carModel, String carMake, int carYear) {
        model = carModel;
        make = carMake;
        year = carYear;

    }

    void printCarInfo() {
        System.out.println("Model " + model + " Make " + make + " Year " + year);
    }
}
