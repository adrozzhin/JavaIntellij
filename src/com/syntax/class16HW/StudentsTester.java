package com.syntax.class16HW;

public class StudentsTester {

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.studentName = "Alex";
        student1.studentID = "ABC123";
        Students.numberOfStudents++;

        Students student2 = new Students();
        student1.studentName = "Michael";
        student1.studentID = "DFG565";
        Students.numberOfStudents++;

        Students student3 = new Students();
        student1.studentName = "Lee";
        student1.studentID = "EES888";
        Students.numberOfStudents++;

        System.out.println("Number of students: " + Students.numberOfStudents);





    }
}
