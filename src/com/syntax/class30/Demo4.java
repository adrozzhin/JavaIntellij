package com.syntax.class30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        Map<String, Double> electronics = new LinkedHashMap<>();
        electronics.put("TV", 10.0);
        electronics.put("Remote", 3.9);
        electronics.put("dryer", 5.5);

        Set<Map.Entry<String, Double>> entrySet = electronics.entrySet();

        for (Map.Entry<String, Double> entry: entrySet
             ) {
            System.out.println(entry.getKey() + "        " + entry.getValue());
        }

    }
}

