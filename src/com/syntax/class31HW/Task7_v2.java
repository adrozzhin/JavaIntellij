package com.syntax.class31HW;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task7_v2 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        words.add("apple");
        words.add("chair");
        words.add("wardrobe");
        words.add("plate");
        words.add("oven");
        words.add("pool");
        words.add("backyard");
        Iterator<String> iter = words.iterator();
        while (iter.hasNext()) {
            String e= iter.next();


        }
        String joined = String.join(",", words);
        System.out.println(joined+ " ");
    }
}
