package com.syntax.class27HW.Task1;

/*
Create  an  Interface  'Shape'  with  undefined methods as calculateArea and calculatePerimiter.
Create  2  classes  Circle  & Square that implements functionality defined in the Shape Interface. Test your code.
 */

public interface Shape {

    void calculateArea(int x);
    void calculatePerimeter(int x);
}

class Circle implements Shape {
    @Override
    public void calculateArea(int x) {
        System.out.println("The area of circle with radius: "+x+" is equal to: "+ Math.PI*Math.pow(x,2));
    }

    @Override
    public void calculatePerimeter(int x) {
        System.out.println("The perimeter of circle with radius: "+x+" is equal to: "+ 2*Math.PI*x);
    }
}
class Square implements Shape {
    @Override
    public void calculateArea(int x) {
        System.out.println("The area of square with side: "+x+" is equal to: "+Math.pow(x,2));
    }

    @Override
    public void calculatePerimeter(int x) {
        System.out.println("The perimeter of square with side: "+x+" is equal to: "+ 4*x);
    }
}

