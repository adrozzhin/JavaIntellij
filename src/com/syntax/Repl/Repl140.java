package com.syntax.Repl;

public class Repl140 {
    static String maxLength(String[] arr) {
        String largest = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i].length()>arr[i-1].length()) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
