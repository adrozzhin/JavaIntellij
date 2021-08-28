package com.syntax.class18HW;

public class StudentTwo {

    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    StudentTwo(String studentName, String studentAddress) {
        name = studentName;
        address = studentAddress;
    }
    void displayInfo(){
        System.out.println("Name: " + name + ". Address: "+ address);
    }
}
