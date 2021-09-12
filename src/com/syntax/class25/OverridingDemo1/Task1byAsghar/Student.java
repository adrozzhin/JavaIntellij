package com.syntax.class25.OverridingDemo1.Task1byAsghar;

public class Student {
    void study() {
        System.out.println("Students must study");
    }
    void doHomeWork() {
        System.out.println("Students must do homework");
    }
    void practice() {
        System.out.println("Students must practice");
    }
}

class SyntaxStudent extends Student{
    void study() {
        System.out.println("Syntax Students must study hard to get a job quickly");
    }
    void doHomeWork() {
        System.out.println("Syntax Students must do programming homework");
    }
    void doResearch() {
        System.out.println("Syntax Students must research on Google and watch YouTube videos");
    }
}
class CollegeStudent extends Student{

    void doHomeWork() {
        System.out.println("College Students must do homework to get good grades");
    }
}
class SchoolStudent extends Student {
}

