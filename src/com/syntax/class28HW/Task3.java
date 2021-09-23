package com.syntax.class28HW;

import java.util.ArrayList;

/*
Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinkArray = new ArrayList<>();
        drinkArray.add("Tequila");
        drinkArray.add("Rum");
        drinkArray.add("Vodka");
        drinkArray.add("Wine");
        drinkArray.add("Gin");
        System.out.println(drinkArray);

        for (int i = 0; i < drinkArray.size(); i++) {
            if (drinkArray.get(i).contains("a") || drinkArray.get(i).contains("e")) {
                drinkArray.set(i, "water");
            }
        }
        System.out.println(drinkArray);
    }
}
