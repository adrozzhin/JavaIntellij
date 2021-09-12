package com.syntax.class27.Encapsulation;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Andrei");
        person.setAge(30);
        person.setWeight(75);
        person.setHeight(173);
        person.printInfo();

        Person person1 = new Person();
        person1.setName("Mike");
        person1.setAge(40);
        person1.setWeight(90);
        person1.setHeight(185);
        person1.printInfo();
    }
}
