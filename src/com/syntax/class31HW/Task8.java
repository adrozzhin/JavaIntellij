package com.syntax.class31HW;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(54);
        list.add(33);
        list.add(54);

        int sum = 0;
        for (Integer num: list
             ) {
            sum = sum + num;
        }
        System.out.println("Summary of a list of integers is: " + sum);
    }
}
