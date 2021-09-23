package com.syntax.class28;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setSSN("123456789");
        System.out.println(person.getName());
        System.out.println(person.getAge("123456789"));
        System.out.println(person.getSSN("12345"));

    }
}
