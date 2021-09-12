package com.syntax.advancedjava.Calculator;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Calculator {
    private double value;
    public Calculator() {
        this.value = 0.0;
    }
    public void add(double val) {
        value = value+val;
    }
    public void subtract(double val) {
        value = value-val;
    }
    public void multiply(double val) {
        value = value*val;
    }
    public void divide(double val) {
        value = value/val;
    }
    public void clear() {
        value = 0.0;
    }
    public double getValue() {
        return value;
    }
}
class Tester {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 'x':");
        x = scan.nextInt();
        System.out.println("Please enter 'y':");
        y = scan.nextInt();





    }

}



