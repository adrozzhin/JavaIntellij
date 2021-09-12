package com.syntax.Repl.Repl168;

public class Repl168 {

        final static String reverse(String input) {
            //input = "Hello";
            StringBuilder stringBuilder = new StringBuilder(input);
            return stringBuilder.reverse().toString();
        }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }



}
