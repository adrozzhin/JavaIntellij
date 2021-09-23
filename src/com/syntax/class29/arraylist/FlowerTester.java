package com.syntax.class29.arraylist;

import java.util.ArrayList;

public class FlowerTester {
    public static void main(String[] args) {
//        Flower [] flowers1 = {new Rose("Rose", "pink"),
//                        new Tulip("Tulip", "Red")};
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(new Rose("Rose", "pink"));
        flowers.add(new Tulip("Tulip", "red"));
        flowers.add(new Sunflower("Sunflower", "yellow"));

        for (Flower flower:flowers
             ) {
            flower.bloom();
        }
    }
}
