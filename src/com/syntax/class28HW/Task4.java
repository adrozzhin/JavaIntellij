package com.syntax.class28HW;

/*
Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<>();

        for (int i = 2; i <= 50; i+=2) {
            numberArray.add(i);
        }
        System.out.println(numberArray);

       // numberArray.removeIf(n->(n%5==0));

        Iterator<Integer> iterator = numberArray.iterator();
        while (iterator.hasNext()) {
            if(iterator.next()%5==0) {
                iterator.remove();
            }
        }
        System.out.println(numberArray);
    }
}
