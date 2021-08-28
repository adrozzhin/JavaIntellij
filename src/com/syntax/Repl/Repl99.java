package com.syntax.Repl;

import java.util.Scanner;

public class Repl99 {
    public static void main(String[] args) {
        String word;
        String reversed = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        word = scan.nextLine();
        for (int i=word.length()-1;i>=0;i--) {
            char letter = word.charAt(i);
            reversed = reversed+letter;

          //  reversed.charAt(word.length()-i) = word.charAt(i);
        }
        System.out.println(reversed);
    }
}
