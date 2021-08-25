package com.syntax.class15;

public class HW6v_2 {

    public static void main(String[] args) {
        String str = "abab";
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("NOT palindrome");
        }
    }
}
