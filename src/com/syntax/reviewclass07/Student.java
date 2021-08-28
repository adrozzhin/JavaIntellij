package com.syntax.reviewclass07;

public class Student {
    String name;
    String cource;
    static String institute;
    static int level = 4;

    void classes() {
        int sessions = 25;
        for (int i = 0; i < sessions; i++) {
            System.out.println("Students can study");
        }

    }

    int studentFee() {
        int fee = 1000;
        int tax = 240;
        return fee + tax + 20;

    }
    void displayTheFees() {
        System.out.println(name + " from " + cource +" will pay " + studentFee());
    }


}
