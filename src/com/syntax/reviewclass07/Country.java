package com.syntax.reviewclass07;

public class Country {
    static int dialCode = 1;
    String state;

    static void display() {
        System.out.println(dialCode);

    }

    void display2() {
        System.out.println(dialCode);
        System.out.println("The dial code for state: " +state + " is: " +dialCode);
    }
}
