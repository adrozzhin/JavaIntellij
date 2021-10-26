package com.syntax.Repl;

import java.util.Scanner;

public class Repl215_Serge {
    public static void main(String[] args) {
        System.out.println(isBalanced("(()))"));
    }

    public static boolean isBalanced(String s){
        String a,b;
        a = s.replaceAll("[(]", "");
        b = s.replaceAll("[)]", "");
        if (a.length() == b.length()) {
            return true;
        } else {
            return false;
        }
    }
}

