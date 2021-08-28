package com.syntax.class18HW;

public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("Andrei", 60,
                70,80);
        student1.printGrades();
        Student student2 = new Student("Kseniia", 70,
                80,90);
        student2.printGrades();
        Student student3 = new Student("Mike", 80,
                90,100);
        student3.printGrades();
        Student student4 = new Student("Bobby", 90,
                100,110);
        student4.printGrades();
        Student student5 = new Student("Ann", 65,
                75,99);
        student5.printGrades();

    }
}
