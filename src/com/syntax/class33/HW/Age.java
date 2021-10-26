package com.syntax.class33.HW;
/*
Create a method to check age eligibility that will throw a runtime exception.
Method should throw an exception age is less than 16.
 */

import java.util.InputMismatchException;

public class Age {

    public static void AgeChecker(int age) {
        if (age < 16) {
            throw new ArithmeticException("Too young");
        } else {
            System.out.println("Age: " + age + " is eligible");
        }
    }

    public static void main(String[] args) {
        AgeChecker(15);

    }
}
