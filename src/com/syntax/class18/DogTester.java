package com.syntax.class18;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Tommy", 10, 11.5, 21.1, "Bulldog", "White");

        dog1.printDogInfo();

        Dog dog2 = new Dog("Bobby");
        dog2.printDogInfo();

        Dog dog3 = new Dog("Fluffy", 5);
        dog3.printDogInfo();

    }
}
