package com.syntax.class29HW;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */
public class Cities {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("HongKong");
        linkedHashSet.add("Bangkok");
        linkedHashSet.add("Ankara");
        linkedHashSet.add("Istanbul");
        linkedHashSet.add("Anchorage");
        System.out.println(linkedHashSet);
        Iterator<String> iterator = linkedHashSet.iterator();

        while (iterator.hasNext()) {
            String city = iterator.next();
            if (city.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(linkedHashSet);
    }
}
