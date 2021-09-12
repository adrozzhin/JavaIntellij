package com.syntax.class23;

public class Parent {
    String name = "akbulut";

    void printName() {
        System.out.println("Name is " + name);
    }
    void getMarried() {
        System.out.println(" my children will get marry by my choise");
    }
}

class Child extends Parent{
    String name = "Enes";
    void printName() {
        System.out.println("Name is " + name);
        System.out.println("Name is " + this.name);
        System.out.println("Name is " + super.name);
    }
    void getMarried() {
        System.out.println("But I like someone else");
    }
    void letsDoSomethingCrazy() {
        super.getMarried();
        getMarried();
    }
}