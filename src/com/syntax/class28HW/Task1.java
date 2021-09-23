package com.syntax.class28HW;

/*
Create an arraylist of cars and retrieve all the values using 3 different ways.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("Ford");
        arrayList.add("Honda");

        System.out.println("First method:");
        System.out.println(arrayList);
        System.out.println("--------------------");
        System.out.println("Second method:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+ " ");
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Third method:");
        //when using accessing the elements only use enhanced for loop
        for (String make:arrayList
             ) {
            System.out.print(make + " ");
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Fourth method:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() +" ");
        }
    }
}
