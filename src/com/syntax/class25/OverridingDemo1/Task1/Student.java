package com.syntax.class25.OverridingDemo1.Task1;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses
    as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override
    some methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
     */
    String name;
    String lastName;
    int age;

    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    void study() {
        System.out.println(name + " study in general");
    }
    void passExam() {
        System.out.println(name + " have to pass exams");
    }
}
