package com.syntax.class27HW.Task3;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Truck(3000,10000);
        car.calculateSalePrice();

        Car car1 = new Truck(1900,10000);
        car1.calculateSalePrice();

        Car car2 = new Sedan(25,20000);
        car2.calculateSalePrice();

        Car car3 = new Sedan(18,20000);
        car3.calculateSalePrice();
    }
}
