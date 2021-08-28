package com.syntax.class18;

import java.util.Scanner;

public class PersonTester {

    public static void main(String[] args) {
        Person person = new Person("Andrei", 30, "Russia");

        Person person2 = new Person("Mike", 18, "Russia");

        person.printInfo();
        person2.printInfo();



    }
}
