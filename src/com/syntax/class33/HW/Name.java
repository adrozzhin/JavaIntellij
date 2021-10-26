package com.syntax.class33.HW;
/*
Create a method checkUserName that will throw a runtime exception.
Method should throw an exception when entered username is less than 5 characters.
 */

public class Name {
    public static void checkUserName(String name) {
        if (name.length()<5) {
            throw new ArithmeticException("Name is too short");
        } else {
            System.out.println("Name: " + name + " is eligible");
        }
    }

    public static void main(String[] args) {
        checkUserName("John D");
    }
}
