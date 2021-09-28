package com.syntax.class31HW;

/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Canada", "Ottawa");
        countries.put("Turkey", "Istanbul");
        countries.put("Great Britain", "London");
        countries.put("Australia", "Canberra");

        System.out.println("------Printing all entries with for each loop------");

        Set<Map.Entry<String, String>> ctrSet = countries.entrySet();

        for (Map.Entry ent: ctrSet
             ) {
            System.out.println(ent);
        }
        System.out.println("------Printing all entries with iterator------");

        Iterator<Map.Entry<String, String>> it = ctrSet.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> ctr = it.next();
            System.out.println(ctr);
        }
        System.out.println("------Printing all values with for each loop------");

        Collection<String> val = countries.values();

        for (String value: val
             ) {
            System.out.println(value);
        }
        System.out.println("------Printing all values with iterator------");
        Iterator<String> it2 = val.iterator();
        while ((it2.hasNext())) {
            String v = it2.next();
            System.out.println(v);
        }
    }
}
