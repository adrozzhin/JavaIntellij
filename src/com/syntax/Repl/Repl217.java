package com.syntax.Repl;

/*
Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1
 */

import java.util.*;

public class Repl217 {
    public static void main(String[] args ){
        List<Integer> myList = Arrays.asList(12,12,13,45,78,7,7);

        System.out.println(countDuplicates(myList));

    }
    static int countDuplicates(List<Integer> numbers){

        Set<Integer> set = new HashSet<>(numbers);
        //System.out.println(set);
        int counterOfMultipleOccurance=0;
        for (Integer x:set
             ) {
            //System.out.println(x + ": " + Collections.frequency(numbers,x));
            if(Collections.frequency(numbers,x)>1) {
                counterOfMultipleOccurance++;
            }
        }
        return counterOfMultipleOccurance;
    }
}
