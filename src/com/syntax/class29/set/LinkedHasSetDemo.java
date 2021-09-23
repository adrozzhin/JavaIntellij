package com.syntax.class29.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHasSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("apple");

        System.out.println(fruits);
    }
}
