package com.syntax.class18;

public class Person {
    String name;
    int age;
    String country;

    void printInfo() {
        System.out.println("Name " + name + " Age " + age + " Country " + country);

    }
    Person(String personName, int personAge, String personCountry) {
        name = personName;
        age = personAge;
        country = personCountry;

    }
}
