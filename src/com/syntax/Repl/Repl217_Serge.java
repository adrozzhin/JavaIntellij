package com.syntax.Repl;

/*
Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1
 */

import java.util.*;

public class Repl217_Serge {
    public static void main(String[] args ){
        List<Integer> myList = Arrays.asList(1,2,2,1,3);

        System.out.println(countDuplicates(myList));

    }
    static int countDuplicates(List<Integer> numbers){
        int dublicates = 0;
        for (int i=0; i < numbers.size(); i++) {
            int dub = 0;
            for (int j=i+1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    dub++;
                }
            }
            if (dub == 1) {
                dublicates++;
            }
        }
        return dublicates;
    }
}
