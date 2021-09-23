package com.syntax.advancedjava.Calculator;

import java.util.Scanner;

public class Calculator {
    private double value;
    static double subtotal;

    public Calculator() {
        this.value = 0.0;
    }

    public void add(double val) {
        this.value = value + val;
    }

    public void subtract(double val) {
        this.value = value - val;
    }

    public void multiply(double val) {
        this.value = value * val;
    }

    public void divide(double val) {
        this.value = value / val;
    }

    public void power(double val) {
        this.value = Math.pow(value, val);
    }

    public void clear() {
        this.value = 0.0;
    }

    public void subt() {
        this.subtotal = value;
        this.value = 0.0;
    }

    public void returnSubtotal() {
        double sum = value + subtotal;
        this.value = sum - value;
        this.subtotal = sum - value;

    }

    public double getValue() {
        return value;
    }
}

class Tester extends Calculator {

    public static void main(String[] args) {
        int x;
        int y;

        String exp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 'x':");
        x = scan.nextInt();
        System.out.println("Please enter 'y':");
        y = scan.nextInt();
//        System.out.println("Please enter the expression:");
//        Scanner scan2 = new Scanner(System.in);
//        exp = scan2.nextLine();
//        System.out.println(exp);
        //(12x^3 + 5 - 3y^2)/(4y + x)


        Calculator calculator = new Calculator();

        System.out.println("value= " + calculator.getValue());
        calculator.add(12);
        System.out.println("value= " + calculator.getValue());
        calculator.multiply(x);
        System.out.println("value= " + calculator.getValue());
        calculator.power(3);
        System.out.println("value= " + calculator.getValue());
        calculator.add(5);
        System.out.println("value= " + calculator.getValue());
        System.out.println("Storing value in temporary value 'subtotal' to perform next part of calculation:");
        calculator.subt();
        calculator.add(y);
        System.out.println("value= " + calculator.getValue());
        calculator.multiply(3);
        System.out.println("value= " + calculator.getValue());
        calculator.power(2);
        System.out.println("value= " + calculator.getValue());
        System.out.println("Returning the 'value' to the original value:");
        calculator.returnSubtotal();
        System.out.println("value= " + calculator.getValue());
        calculator.subtract(subtotal);
        System.out.println("value= " + calculator.getValue());
        System.out.println("Again storing value in temporary value 'subtotal' to perform next part of calculation:");
        calculator.subt();
        calculator.add(4);
        System.out.println("value= " + calculator.getValue());
        calculator.multiply(y);
        System.out.println("value= " + calculator.getValue());
        calculator.add(x);
        System.out.println("value= " + calculator.getValue());
        System.out.println("Returning the 'value' to the original value:");
        calculator.returnSubtotal();
        System.out.println("value= " + calculator.getValue());
        calculator.divide(subtotal);
        System.out.println("value= " + calculator.getValue());
        System.out.println("The final result of calculation of expression: (12x^3 + 5 - 3y^2)/(4y + x) with x= " + x + " and y=" + y + " is:" + calculator.getValue());

    }
}



