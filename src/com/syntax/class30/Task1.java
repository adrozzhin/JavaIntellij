package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("kiwi", 10);
        fruits.put("melon", 10);
        fruits.put("mango", 7);
        fruits.put("peach", 9);
        fruits.put("apple", 12);
        fruits.put("orange", 15);
        System.out.println(fruits);
        System.out.println(fruits.get("peach"));
        System.out.println(fruits.containsValue(12));
        System.out.println(fruits.containsKey("mango"));
        fruits.remove("orange");
        System.out.println(fruits);
        fruits.replace("peach", 9, 18);
        System.out.println(fruits);



    }
}
