package com.syntax.class15;

public class HW5v_2 {
    public static void main(String[] args) {
        String str = "This is a string variable";

        String arr[] = str.split(" ");
        String reversed = "";
        for(int i=0;i< arr.length;i++) {
            StringBuilder stringBuilder = new StringBuilder(arr[i]);
            stringBuilder.reverse();
            reversed+=stringBuilder+" ";

        }
        System.out.println(reversed);
    }
}
