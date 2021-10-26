package com.syntax.class30;

import java.util.HashMap;
import java.util.HashSet;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, Double> groceries = new HashMap<>();
        System.out.println(groceries.values());

        groceries.put("Egg", 12.0);
        groceries.put("Tomato", 5.5);
        groceries.put("Milk", 2.5);
        groceries.put("Potato", 4.2);
        groceries.put("Steak", 3.5);
        System.out.println(groceries.values());
//        System.out.println(groceries);
//        groceries.put(null,null);
//        groceries.put("shirt", null);
//        groceries.put(null,5.0);
//        groceries.put("orange", null);
//        groceries.replace("Milk", 5.5);
//        System.out.println(groceries);
//        System.out.println(groceries.containsKey("Potat"));

    }
}
