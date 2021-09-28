package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1,"Maria");
        student.put(2,"Jamil");
        student.put(3,"Andrei");
        student.put(4,"Ana");
        student.put(5,"Olena");

        Collection<String> values = student.values();
        for (String students:values
             ) {
            System.out.println(students);
        }
        Set<Integer> keys = student.keySet();
        for (Integer key: student.keySet()
             ) {
            System.out.println(key);
        }
    }
}
