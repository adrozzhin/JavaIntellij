package com.syntax.reviewclass13;

public class Person {
    //bean class
    String firstName;
    String lastName;
    String age;
    String salary;

    public Person(String firstName, String lastName, String age, String salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
