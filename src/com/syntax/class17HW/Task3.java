package com.syntax.class17HW;

public class Task3 {
    /*
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    private String vowels(String word) {
        String onlyVowels = word.replaceAll("[^aeiouyAEIOUY]",
                "");
        return onlyVowels;
    }

    public static void main(String[] args) {
        String wordInSameClass = "Word in same class";
        Task3 task3 = new Task3();
        System.out.println("vowels in the String '" + wordInSameClass +
                "' are: '" + task3.vowels(wordInSameClass) + "'");
    }

}
