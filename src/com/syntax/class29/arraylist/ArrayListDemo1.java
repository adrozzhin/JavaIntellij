package com.syntax.class29.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.2);
        //numbers.add(10); //no auto conversion from int to double
        numbers.add(105.2);
        numbers.add(1.2);
        numbers.add(72.2);
        numbers.add(89.2);
        numbers.add(56.2);
        System.out.println(numbers.size());
        System.out.println(numbers);
        numbers.set(1,120.0);
        System.out.println(numbers);
        System.out.println(numbers.get(2));
        numbers.remove(120.0);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i)*2);
        }
        System.out.println(numbers);
    }
}
