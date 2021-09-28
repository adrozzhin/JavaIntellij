package com.syntax.class31HW;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("I");
        set.add("am");
        set.add("doing");
        set.add("seventh");
        set.add("task");
        String sum = "";
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String i = iterator.next();
            //sum = sum + i + " ";
            sum = sum.concat(i).concat(" ");
        }
        System.out.println(sum);
    }
}
