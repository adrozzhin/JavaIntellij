package com.syntax.class23HW.Task2;

public class Area {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
    Use separate class to test your code
     */
    double width;
    double length;
    double depth;

    public void Area(double width, double length) {
        double rectangleArea;
        this.width = width;
        this.length=length;
        rectangleArea = width*length;
        System.out.println("The area of rectangle is: " + rectangleArea);
    }
    public void Area(double width) {
        double squareArea;
        this.width = width;
        squareArea = Math.pow(width,2);
        System.out.println("The area of square is: " + squareArea);
    }
    public void Area(double width, double length, double depth) {
        double boxVolume;
        this.width = width;
        this.length=length;
        this.depth=depth;
        boxVolume = width*length*depth;
        System.out.println("The volume of box is: " + boxVolume);
    }


}
