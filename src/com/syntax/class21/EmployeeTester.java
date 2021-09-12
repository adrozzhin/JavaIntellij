package com.syntax.class21;

public class EmployeeTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 20;
        person.eat();
        person.sleep();
        Employee employee = new Employee();
        employee.work();
        employee.getPaid();
    }
}
