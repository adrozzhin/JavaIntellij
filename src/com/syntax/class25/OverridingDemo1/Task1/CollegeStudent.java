package com.syntax.class25.OverridingDemo1.Task1;

public class CollegeStudent extends Student{
    public CollegeStudent(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    void study() {
        System.out.println(name + " learn a lot of subjects");
    }
    void passExam() {
        System.out.println(name + " have to pass a lot of exams");
    }
    void getJob() {
        System.out.println(name + " will probably get a job");
    }
}
