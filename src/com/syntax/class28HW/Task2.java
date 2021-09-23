package com.syntax.class28HW;

/*
Create an arrayList of words. Remove every word that ends with “e”.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Pear");
        fruitList.add("Grape");

        //fruitList.removeIf(word ->(word.endsWith("e")));

        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if(word.endsWith("e") || word.endsWith("E")) {
                iterator.remove();
            }
        }

        System.out.println(fruitList);
   }
}
