package com.syntax.reviewclass07;

public class MethodDemo2 {
    public static void main(String[] args) {
        String test = "Automation job is in high demand";
        String reversed = "";

        for (int i=test.length()-1;i>=0;i--) {
            reversed+=test.charAt(i);
        }
        System.out.println(reversed);
    }
}
