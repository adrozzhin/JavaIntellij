package com.syntax.class18HW;

public class Student {
    /*
    Write a java program of Class Students that takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.
    NOTE: please use different names for instance and local variables.
     */
    String name;
    int mathGrade;
    int chemistryGrade;
    int phisicsGrade;
    int average;

    Student(String studentName, int studentMathGrade,
            int studentChemistryGrade, int studentPhisicsGrade){
        name = studentName;
        mathGrade = studentMathGrade;
        chemistryGrade = studentChemistryGrade;
        phisicsGrade = studentPhisicsGrade;
        average = (mathGrade + chemistryGrade + phisicsGrade)/3;
    }
    void printGrades() {
        System.out.println("Student " + name + " has grade: " + mathGrade +
                " for Math and " + chemistryGrade + " for Chemistry and "
                + phisicsGrade + " for Phisics. Average grade is " + average);
    }
}
