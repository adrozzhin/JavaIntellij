package com.syntax.class29.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Night");
        words.add("Day");
        words.add("Sun");
        words.add("Moon");
        System.out.println(words.contains("Lion"));
        System.out.println(words.contains("Moon"));

        System.out.println(words);
        ArrayList<String> otherwords = new ArrayList<>();
        otherwords.add("Cat");
        otherwords.add("Dog");
        System.out.println(words.containsAll(otherwords));
    }
}
