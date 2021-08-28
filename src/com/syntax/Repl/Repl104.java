package com.syntax.Repl;

import java.util.Scanner;

public class Repl104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        String[] nameArr = new String[5];
        for (int i = 0; i < nameArr.length; i++) {
            System.out.println("enter name:");
            nameArr[i] = scan.nextLine();

        }
        for (int i=0;i<nameArr.length;i++) {
            System.out.println(nameArr[i].substring(0, 3));
        }
    }

}

