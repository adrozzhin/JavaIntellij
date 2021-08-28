package com.syntax.Repl;

public class Repl119 {
    String censorLetter (String str, char ch) {
        str = str.replace(ch, '*');
        return str;
    }
    public static void main(String [] args) {
        Repl119 mn = new Repl119();
        System.out.println(mn.censorLetter("computer science", 'e'));
    }


}
