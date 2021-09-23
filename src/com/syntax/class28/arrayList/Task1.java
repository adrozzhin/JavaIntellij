package com.syntax.class28.arrayList;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that
         */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("John");
        arrayList.add("Andrei");
        arrayList.add("John");
        arrayList.add("Mick");
        arrayList.add("John");
        arrayList.add("Jane");
        arrayList.add("John");
        arrayList.add("Ane");
        System.out.println(arrayList);
        System.out.println(arrayList.remove("Ane"));
        System.out.println(arrayList);

        while (arrayList.remove("John")) {

        }
        System.out.println(arrayList);
        if (arrayList.isEmpty()) {
            System.out.println("Empty arraylist");
        } else {
            System.out.println("NOT empty arraylist");
        }

        if (arrayList.contains("Jane")) {
            System.out.println("Array contains 'Jane'");
        } else {
            System.out.println("Array DOES NOT contains 'Jane'");
        }

        System.out.println("The size of arraylist is: " + arrayList.size());
        System.out.println(arrayList);
    }
}
