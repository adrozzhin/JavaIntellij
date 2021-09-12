package com.syntax.class25.OverridingDemo1;

public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("Person can eat");
    }

    void performDailyActivities() {
        System.out.println("Eat sleep repeat");
    }
}

class Employee extends Person {
    Employee(String name) {
        super(name);
    }

    void performDailyActivities() {
        System.out.println("Office work all the day and emails at night");
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    void performDailyActivities() {
        System.out.println("Attend class and practice at night");
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    void performDailyActivities() {
        System.out.println("Teaching classes checking assignments");
    }
}
