package com.syntax.class23HW.Task1;

public class Shape {
    /*
    Write program: Shape class has a constructor that takes
    the radius and has a subclass as circle class.
    In circle class create a method to calculate the area of circle.
    Test your code.
     */
    double radius;
    Shape (double radius) {
        this.radius=radius;
    }
}
class Circle extends Shape {

    Circle(double radius) {
        super(radius);
    }
    void area() {
        System.out.println("The area of circle with radius: " +
                radius + " is: " + Math.PI*Math.pow(radius,2));
    }
}
