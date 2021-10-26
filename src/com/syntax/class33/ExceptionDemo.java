package com.syntax.class33;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("exception");
        }
        System.out.println("Line 1 after error");
        System.out.println("Line 2 after error");
        System.out.println("Line 3 after error");
        System.out.println("Line 4 after error");
    }
}
