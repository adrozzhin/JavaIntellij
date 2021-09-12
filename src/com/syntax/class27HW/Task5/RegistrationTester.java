package com.syntax.class27HW.Task5;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("pochta@yahoo.com");
        System.out.println(registration.getEmail());

        registration.setUserName("");
        System.out.println(registration.getUserName());

        registration.setPassword("TestUser");
        System.out.println(registration.getPassword());
    }
}
