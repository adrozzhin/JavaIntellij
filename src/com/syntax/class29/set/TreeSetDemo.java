package com.syntax.class29.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> letters = new TreeSet<>();
        letters.add("Z");
        letters.add("B");
        letters.add("A");
        letters.add("D");
        letters.add("D");
        System.out.println(letters);
    }
}
