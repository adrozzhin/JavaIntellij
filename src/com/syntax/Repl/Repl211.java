package com.syntax.Repl;

import java.io.PrintStream;

public class Repl211 {
    public static void main(String[]args) {
        int[] arr = {0,1,2,3};
        try{
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e);
            e = new ArrayIndexOutOfBoundsException("4");
            e.printStackTrace();

        }
    }
}
