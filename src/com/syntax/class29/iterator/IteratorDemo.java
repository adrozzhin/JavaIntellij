package com.syntax.class29.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("SDLC");
        subjects.add("Manual");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNJ");
        
        Iterator<String> iterator = subjects.iterator();
        System.out.println(subjects);
        while (iterator.hasNext()) {
            String subject = iterator.next();
            if(subject.length()>4) {
                iterator.remove();
            }
        }
        System.out.println();
    }
}
