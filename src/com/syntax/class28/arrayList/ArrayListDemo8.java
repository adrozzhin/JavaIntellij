package com.syntax.class28.arrayList;

import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("SDLC");
        subjects.add("Manual");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNJ");

//        subjects.remove(0);
//        subjects.remove("Git");



        for (String subject:subjects
             ) {
            if(subject.length()>4) {
                subjects.remove(subject);
            }
        }

        System.out.println(subjects);
    }
}
