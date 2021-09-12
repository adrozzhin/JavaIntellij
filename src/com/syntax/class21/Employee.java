package com.syntax.class21;

public class Employee extends Person {
    String empID;
    double salary;
    void work() {
        System.out.println("Employee " + empID + " and age: " + age);
    }
    void getPaid() {
        System.out.println(empID + " is paid " + salary);
    }
}
