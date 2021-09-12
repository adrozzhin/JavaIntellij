package com.syntax.Repl.Repl142;

public class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies(){

    }
    SyntaxTechnologies(String schoolName, int batch,
                       int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    void printInfo(){
        System.out.print(schoolName + " " + batch + " " + year
                + " " + lastDayOfClass);
        System.out.println();
    }
}
