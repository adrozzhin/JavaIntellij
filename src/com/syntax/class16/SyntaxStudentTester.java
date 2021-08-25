package com.syntax.class16;

public class SyntaxStudentTester {
    public static void main(String[] args) {
        SyntaxStudents student1 = new SyntaxStudents();
        student1.name= "Andrei";
        student1.age=30;
        student1.id = "123";

        student1.dispayCalc();

        System.out.println(SyntaxStudents.schoolName);

        SyntaxStudents student2 = new SyntaxStudents();
        student2.name = "Elizabeth";
        student2.age=18;
        student2.id = "1325";

        System.out.println(SyntaxStudents.schoolName);


    }
}
