package com.syntax.class16;

public class Dog {
    static int noOfLegs;
    String name; // Instance variable
    static String breed;// static variable
    String color;// Instance variable


    void bark() {
        int times=10;  //local var
        for (int i=0;i<times;i++) { //local var
            System.out.println("Dog can bark");
        }
    }

    public static void main(String[] args) {

    }
}
