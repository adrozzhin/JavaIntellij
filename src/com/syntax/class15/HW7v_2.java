package com.syntax.class15;

public class HW7v_2 {

    public static void main(String[] args) {
        String str = "First string";
        String str2 = "Second String Long";

        System.out.println("First string before swap: " + str);
        System.out.println("Second string before swap: " + str2);
        System.out.println("--------");

        str = str+str2; // First stringSecond String Long
        str2=str.substring(0,str.length()-str2.length());
        str = str.substring(str2.length());



        System.out.println("Swapped first string: " + str);
        System.out.println("Swapped second string: " + str2);
    }
}
