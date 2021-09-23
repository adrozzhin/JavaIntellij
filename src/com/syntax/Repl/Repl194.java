package com.syntax.Repl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repl194 {
    public static void removeA (List<String> countries) {
        Iterator<String> iterator = countries.iterator();
        while(iterator.hasNext()) {
            String country = iterator.next();
            if (country.startsWith("A")) {
                iterator.remove();
            }
        }

//        for (String country: countries
//             ) {
//            System.out.println(country);
//        }
    }

    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        Repl194.removeA(countries);
        System.out.println(countries);
    }
}

