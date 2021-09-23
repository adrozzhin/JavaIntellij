package com.syntax.reviewclass10;

public class Area {
    double radius;

    Area(double radius) {
        this.radius = radius;
    }
}

class Circle extends Area {
    Circle(double radius) {
        super(radius);
    }

    void getArea() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }


    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.getArea();
    }
}