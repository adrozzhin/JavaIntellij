package com.syntax.class25.OverridingDemo1.Task1;

public class Tester {
    public static void main(String[] args) {
        SyntaxStudent syntaxStudent = new SyntaxStudent
                ("Andrei", "Drozzhin", 30);
        syntaxStudent.study();
        syntaxStudent.passExam();
        syntaxStudent.getJob();
    }
}
