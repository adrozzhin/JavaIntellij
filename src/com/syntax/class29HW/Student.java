package com.syntax.class29HW;

import java.util.HashSet;
import java.util.Iterator;

/*
Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.
 */
public class Student {
    String name;
    int studentID;

    Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("Andrei", 123));
        hashSet.add(new Student("Mike", 456));
        hashSet.add(new Student("Bob", 789));
        hashSet.add(new Student("Jane", 741));
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.name);
        }
    }
}
