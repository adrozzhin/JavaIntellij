package com.syntax.class29.set;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("apple");

        System.out.println(fruits);

    }
}
