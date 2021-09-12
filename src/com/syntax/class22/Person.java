package com.syntax.class22;

public class Person {
    String name;
    int age;
    double height;
    double weight;

    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public void eat() {
        System.out.println(name + " can eat");
    }
    public void sleep() {
        System.out.println(name + " sleep all the time");
    }

}
