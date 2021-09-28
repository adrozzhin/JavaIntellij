package com.syntax.class30;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice", 5.5);
        grocery.put("milk", 5.5);
        grocery.put("tomato", 5.5);

        Set<String> mapKeys = grocery.keySet();

        for (String key: mapKeys
             ) {
            System.out.println(key);
        }
    }
}
