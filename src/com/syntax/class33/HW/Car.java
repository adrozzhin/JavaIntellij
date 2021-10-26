package com.syntax.class33.HW;

/*
How would handle InputMismatchException?
Input Mismatch Exception when user enters mismatch value then programmer expected.
 */

import java.util.Scanner;

public class Car {
    String model;
    int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void printInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Car year:" + year);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the car model: ");
        String model = scan.nextLine();
        System.out.println("Enter the year: ");
        int year = scan.nextInt();
        Car car = new Car(model, year);
        car.printInfo();
    }
}
