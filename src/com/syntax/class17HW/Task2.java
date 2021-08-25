package com.syntax.class17HW;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public String reverse(String word) {
        String rev = "";
        for (int i=word.length()-1; i>=0; i--) {
            rev = rev + word.charAt(i);
        }
        return rev;

    }
}
