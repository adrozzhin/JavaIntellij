package com.syntax.class26.casting;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();
        Cat cat=(Cat) animal;
        ((Cat)animal).meow();
        cat.meow();

    }
}
