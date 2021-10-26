package com.syntax.Repl;

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
public class Repl216_Serge {
    public static void main(String[] args) {
        int[] arrTest = arraySumToZero(7);
        for (int i = 0; i < arrTest.length; i++) {
            System.out.print(arrTest[i] + " ");
        }
        System.out.println();
    }
    public static int[] arraySumToZero(int N) {
        int[] a = new int[N];
        if (N%2 != 0) {
            a[0] = 0;
            for (int i = 1; i < N; i+=2) {
                a[i] = i;
                a[i+1] = i * -1;
            }
        } else {
            for (int i = 0; i < N; i+=2) {
                a[i] = i+1;
                a[i+1] = (i+1)*-1;
            }
        }
        return a;
    }
}
