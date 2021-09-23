package com.syntax.class29HW;

/*
Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.
 */

import java.util.Iterator;
import java.util.TreeSet;

public class Countries {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Montenegro");
        treeSet.add("Turkey");
        treeSet.add("New Zealand");
        treeSet.add("Brazil");
        System.out.println(treeSet);
        System.out.println("-----------------");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
