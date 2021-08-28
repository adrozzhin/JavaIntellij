package com.syntax.class18HW;

public class Phone {

/*
Write a program that will have a constructor: one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.
 */

    static String phone;
    String color;
    int memory;

    Phone() {
        System.out.println("This constructor is empty");
        System.out.println("Phone model: " + phone + ", color is "+ color + ", memory is: " + memory);
    }
    Phone(String iphone, String color, int memory) {
        phone = iphone;
        //this.phone = phone;
        this.color = color;
        this.memory = memory;


        System.out.println("Phone model: " + phone + ", color is "+ color + ", memory is: " + memory);

    }
}
