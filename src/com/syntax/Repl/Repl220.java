package com.syntax.Repl;

/*
Format the String: Write the logic to format the string in the below given format xxx-xxx-xxx
after each 3 digits there should be dash("-") if there are any spaces in the input remove those

input ["00-44 48 555555"]

output ["004-448-555-555"]

input ["00-44 48 555"]

output["004-448-555"]

input ["00-44 #$% 48 55"]

output ["004-448-55"]
 */

public class Repl220 {
    public static void main(String[] args) {
        System.out.println(formatString("00-44 #$% 48 55"));
    }

    public static String formatString(String S){
        String onlyDigits = S.replaceAll("[^0-9]", "");
        StringBuilder onlyDigitsWithDashes = new StringBuilder(onlyDigits);

        for (int i = 3; i < onlyDigits.length(); i+=4) {
            onlyDigitsWithDashes.insert(i, '-');
        }

        return onlyDigitsWithDashes.toString();
    }
}
