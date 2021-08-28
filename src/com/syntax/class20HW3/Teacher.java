package com.syntax.class20HW3;

public class Teacher {
    /*
    Write a Java program called Teacher.
    Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    that would have it their own features and behaviour.
    Test all 4 classes
     */
    static String school = "School #236";
    String name;
    String lastName;
    int age;
    public void extraClasses() {
        System.out.println("Teacher " + name + " " + lastName +
                " gives extra classes if student wants to");
    }
    public void printInfo() {
        System.out.println("Teacher " + name + " " + lastName + " is " + age +
                " years old and this teacher is from school: " + Teacher.school);
    }
}
