package com.syntax.class26.casting;

public class Animal {
    void sleep() {
        System.out.println("Sleeping");
    }
    void eat() {
        System.out.println("Eating");
    }

}
class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Eat meat");
    }
}
class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("eat milk and and fish");
    }
    void meow() {
        System.out.println("meow");
    }
}