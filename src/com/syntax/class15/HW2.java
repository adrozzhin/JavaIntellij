package com.syntax.class15;

public class HW2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * Create a String that should be combination of letters, numbers and special characters.
         * Find out how many alpha characters are there in the String.
         */

        String str = "/*-/*/-ergfvcaef*/-*/-/as12325EEFDSFWE123`3223^@#T$^&%#$&*@^#";

        String str2 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);
        int length = str2.length();
        System.out.println(length);


    }

}
