package com.syntax.reviewclass12;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setFirstName("Andrei");
        e.setLastName("Drozzhin");
        e.setUserId(123);
        e.setPassword("pass");
        System.out.println(e.getFirstName());
        System.out.println(e.getLastName());
        System.out.println(e.getUserId());
        System.out.println(e.getPassword());

    }
}
