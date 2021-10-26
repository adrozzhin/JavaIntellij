package com.syntax.class33;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        System.out.println("Important code");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Important code");
    }

}
