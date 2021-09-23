package com.syntax.class28.collectionsDemo;

import java.util.Arrays;

public class Issues {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20; //previous value overwritten
        System.out.println(num);
        int[] numArr = new int[3]; // need to define the size first
        numArr[0] = 12;
        numArr[1] = 120;
        numArr[2] = 90;
        System.out.println("Size of the arr before increase " + numArr.length);
        //numArr[3] = 12; index out of bound
        int[] newBiggerArray = new int[4];
        newBiggerArray[0] = numArr[0];
        newBiggerArray[1] = numArr[1];
        newBiggerArray[2] = numArr[2];
        newBiggerArray[3] = 100;
        numArr=newBiggerArray;
        System.out.println(numArr[3]);
        System.out.println("Size of the arr after increase " + numArr.length);

        System.out.println(Arrays.toString(numArr));

    }
}
