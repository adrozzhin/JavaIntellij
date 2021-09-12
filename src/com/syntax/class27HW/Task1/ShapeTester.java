package com.syntax.class27HW.Task1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea(5);
        shape.calculatePerimeter(5);

        Shape shape1 = new Square();
        shape1.calculateArea(3);
        shape1.calculatePerimeter(3);
    }
}
