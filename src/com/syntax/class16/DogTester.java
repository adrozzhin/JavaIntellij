package com.syntax.class16;

public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.name = "James";
        dog1.color = "grey";
        dog1.breed = "Huskey";
        System.out.println(dog1.breed);
        Dog dog2 = new Dog();
        dog2.name = "Bobby";
        dog2.color = "white";
        dog2.breed = "Buldog";
        System.out.println(dog2.breed);
        System.out.println(dog1.breed);
        System.out.println(Dog.breed);


    }
}
