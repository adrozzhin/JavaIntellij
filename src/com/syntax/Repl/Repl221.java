package com.syntax.Repl;
/*
Find the largest even length word from a String
if there are two words with same largest even length return the first one.
if there are not even words return -1

input ["find MaxLen Even"]

output ["MaxLen"]

input["I am very Good at Java"]

output ["very"]

input["I was"]

output ["-1"]
 */

import java.util.ArrayList;
import java.util.List;

public class Repl221 {
    public static void main(String[] args) {
        System.out.println(findMaxLenEven("I was"));
    }

    public static String findMaxLenEven(String str) {
        String[] arr = str.split(" ");

        String maxLenEven = "-1";
        for (int i=arr.length-1;i>=0;i--) {
			if (arr[i].length()>=maxLenEven.length() && arr[i].length()%2==0) {
			    maxLenEven=arr[i];
            }
		}



        return maxLenEven;
    }
}
