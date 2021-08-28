package com.syntax.reviewclass07;

public class MethodDemo4 {
    public static void main(String[] args) {
        String test = "Automation job is in high demand";
        String[] strArr = test.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(strArr[4]);
        System.out.println(strArr[5]);

        for (String str:strArr) {
            System.out.println(str);
        }
    }
}
