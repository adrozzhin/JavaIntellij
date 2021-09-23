package com.syntax.class28.collectionsDemo;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int number = 10;
        System.out.println(Arrays.toString(remove(arr,number)));
    }

    public static int[] remove(int[] arr, int number) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                counter++;
            }
        }
        int[] newArr = new int[arr.length-counter];
        int counter2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=number) {
                newArr[counter2] = arr[i];
                counter2++;
            }
        }
        return newArr;
    }
}


