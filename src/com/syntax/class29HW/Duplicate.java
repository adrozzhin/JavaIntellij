package com.syntax.class29HW;
/*
How can you remove all duplicates from ArrayList?
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println("The ArrayList: " + aList);

        LinkedHashSet<String> lhs = new LinkedHashSet<>(aList);
        System.out.println("The LinkedHashSet based on ArrayList: " + lhs);

        aList = new ArrayList<>(lhs);
        System.out.println("The NON DUPLICATE ArrayList: " + aList);
    }
}