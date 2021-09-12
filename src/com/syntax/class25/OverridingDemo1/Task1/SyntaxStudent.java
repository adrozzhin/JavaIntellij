package com.syntax.class25.OverridingDemo1.Task1;

public class SyntaxStudent extends Student {

    public SyntaxStudent(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    void study() {
        System.out.println(name + " learn coding");
    }
    void passExam() {
        System.out.println(name + " have to pass coding exams");
    }
    void getJob() {
        System.out.println(name + " will get an IT job");
    }
}
