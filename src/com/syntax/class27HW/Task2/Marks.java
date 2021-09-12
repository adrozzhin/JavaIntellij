package com.syntax.class27HW.Task2;
/*
    We  have  to  calculate  the  average  of  marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method  'getPercentage'
    that  will  be  returning the  average  percentage  of  marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks  in  three  subjects  as  its  parameters
    and the marks in four subjects as its parameters for student B. Test your code
     */
public abstract class Marks {
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    abstract void getPercentage();
}
class StudentA extends Marks {
    StudentA(int sub1, int sub2, int sub3) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
    @Override
    void getPercentage() {
        double av = (sub1+sub2+sub3)/3;
        System.out.println("Average for studentA is: "+av);
    }
}
class StudentB extends Marks {
    StudentB(int sub1, int sub2, int sub3, int sub4) {

        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
    @Override
    void getPercentage() {
        double av = (sub1+sub2+sub3+sub4)/4;
        System.out.println("Average for studentB is: "+av);
    }
}
