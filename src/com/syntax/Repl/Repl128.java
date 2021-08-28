package com.syntax.Repl;

public class Repl128 {
    static String mixString(String s1, String s2) {
        String mixed = "";
        for(int i=0; i<s1.length();i++){
            mixed=mixed + s1.charAt(i) + s2.charAt(i);
        }
        return mixed;

    }


    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);
    }
}
