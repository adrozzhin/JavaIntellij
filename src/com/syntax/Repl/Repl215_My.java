package com.syntax.Repl;

public class Repl215_My {
    public static void main(String[] args) {
        System.out.println(isBalanced("(())"));
    }

    public static boolean isBalanced(String s) {

        int openBracketsCounter = 0;
        int closeBracketsCounter = 0;



        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openBracketsCounter++;
            } else if (s.charAt(i) == ')') {
                closeBracketsCounter++;
            }
        }

        System.out.println("openBracketsCounter: "+openBracketsCounter);
        System.out.println("closeBracketsCounter " + closeBracketsCounter);

        if(openBracketsCounter==closeBracketsCounter) {
            return true;
        } else {
            return false;
        }
    }
}

