package com.syntax.class20HW3;

public class TeacherTester {
    public static void main(String[] args) {
        PianoTeacher pianoTeacher = new PianoTeacher();
        pianoTeacher.name = "Alex";
        pianoTeacher.lastName = "Rodrigues";
        pianoTeacher.age = 30;

        pianoTeacher.accessToMusicClass = true;
        pianoTeacher.printInfo();
        pianoTeacher.piano();
        pianoTeacher.extraClasses();

        System.out.println("-------------");

        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Michael";
        mathTeacher.lastName = "Wienner";
        mathTeacher.age = 35;
        mathTeacher.accessToMathClass = true;
        mathTeacher.printInfo();
        mathTeacher.math();

        System.out.println("-------------");

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name = "Albert";
        chemistryTeacher.lastName = "Block";
        chemistryTeacher.age = 45;
        chemistryTeacher.accessToChemistryClass = true;
        chemistryTeacher.printInfo();
        chemistryTeacher.chemistry();
        chemistryTeacher.extraClasses();
    }




}
