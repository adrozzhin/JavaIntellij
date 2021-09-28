package com.syntax.class29HW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

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
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Andrei", 123));
        students.add(new Student("Mike", 456));
        students.add(new Student("Bob", 789));
        students.add(new Student("Jane", 741));
        System.out.println(students.size());
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.name + student.studentID);
        }

        System.out.println("-------------------");

        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().name);

        }
    }
}
