package com.syntax.class18HW;

import com.syntax.class18.EmployeeTesterOutsidePackage;

public class Employee {
    /*
    Write a program  that will have 4 different access levels of
    constructors and create 3 objects of this class:
    1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */

    String firstname;
    String lastName;
    int age;
    int id;


    public Employee(){
        firstname = "Andrei";
        lastName = "Drozzhin";
        age = 30;
        id = 111;
        System.out.println("Public constructor");
    }
    protected Employee(String employeeFirstName){
        firstname = employeeFirstName;
        lastName = "Brown";
        age = 20;
        id = 232;
        System.out.println("Protected constructor");
    }
    Employee(String employeeFirstName, String employeeLastName){
        firstname = employeeFirstName;
        lastName = employeeLastName;
        age = 25;
        id = 568;
        System.out.println("Default constructor");
    }
    private Employee(String employeeFirstName, String employeeLastName, int employeeAge){
        firstname = employeeFirstName;
        lastName = employeeLastName;
        age = employeeAge;
        id = 777;
        System.out.println("Private constructor");
    }

    public void printEmployeeInfo() {
        System.out.println("First name: " + firstname + " Last name: " +
                lastName + " Age: " + age + " ID: " + id);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Michael", "Jordan", 33);
        employee1.printEmployeeInfo();
    }



}
