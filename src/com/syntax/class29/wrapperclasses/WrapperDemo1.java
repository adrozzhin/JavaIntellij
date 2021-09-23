package com.syntax.class29.wrapperclasses;

import java.util.ArrayList;

public class WrapperDemo1 {
    public static void main(String[] args) {
        String name = "Hello";
        String name2 = new String("HEllo");
        Integer number = new Integer(10); //Boxing
        String strNumber = number.toString();
        System.out.println(strNumber);
        Integer number2 = 20; //Autoboxing
        Double doubleNumber = 35.0;
        int number3 = Integer.parseInt("1000");
        Integer number4 = Integer.parseInt("2000");
        System.out.println();
        int number6=number.intValue(); //unboxing
        int number7 = number; //autounboxing


    }
}
