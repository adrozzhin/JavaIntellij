package com.syntax.Repl;

public class Repl116 {
    String spaceOut(String str) {
        String longStr="";
        for(int i=0;i<str.length();i++) {
            longStr = longStr + str.charAt(i) + " ";
        }
        return longStr;
    }

    public static void main(String[] args) {
        Repl116 rp = new Repl116();
        System.out.println(rp.spaceOut("Wird"));
    }
}
