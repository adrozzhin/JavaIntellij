package com.syntax.class33.HW;

/*
Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ExList {
    public static void ExListMethod() {
        ArrayList<Exception> list = new ArrayList<>();
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ariphmetic Exception");
            list.add(e);
        }


        try {
            int[] arr = {1,2,3,4};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("array out of bound");
            list.add(e1);
        }

        try {
            String str = "Hi";
            System.out.println(str.charAt(2));
        } catch (StringIndexOutOfBoundsException e2) {
            System.out.println("String out of bound");
            list.add(e2);
        }

        try {
            String[] arr = new String[-23];
        } catch (NegativeArraySizeException e3) {
            System.out.println("Negative array length");
            list.add(e3);
        }

        for (Exception ex : list
        ) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        ExListMethod();
    }

}
