package com.syntax.Repl;

import java.util.Arrays;
import java.util.Random;

/*
Create an Array of size N whose elements sum to zero

ArraySumToZero(0) ->{}

ArraySumToZero(1) ->{0}

ArraySumToZero(2) ->{-1,1}

ArraySumToZero(3) ->{1,-1,0}

ArraySumToZero(4) ->{2,-2,3,-3}

N will be given as input to the function and function will return an array whose element will sum to zero.
 */
public class Repl216 {
    public static void main(String[] args) {
        int[] arrTest = arraySumToZero(5);
        for (int i = 0; i < arrTest.length; i++) {
            System.out.print(arrTest[i] + " ");
        }
        System.out.println();
    }
    public static int[] arraySumToZero(int x) {
        int[] arr = new int[x];

        if(x==0) {
            return arr;
        } else if (x==1) {
            arr[0] = 0;
            return arr;
        } else {
            Random random = new Random();

            arr[0] = random.nextInt(x/2)+1;
            for (int i = 1; i < x; i++) {
                arr[i] = arr[i - 1] * (-1);
                if (arr[i] > 0 && i != arr.length - 1) {
                    arr[i] = arr[i] + 1;
                } else if (i==arr.length-1 && i%2==0) {
                    arr[i]=0;
                }
            }
        }
        return arr;
    }
}
