package com.syntax.Repl;

public class Repl131 {
    static String thirdLetter(String s) {
        String changed="";
        for(int i=0;i<s.length();i++) {

            if(i==0 || i%3==0) {
                changed = changed + s.charAt(i);
            }
        }
            //
        return changed;
    }



    //test case below (dont change):
    public static void main(String[] args){
        thirdLetter("hello there"); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
