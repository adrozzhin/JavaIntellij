package com.syntax.Repl;

public class SyntaxStudentException extends Exception {

    public SyntaxStudentException(String grade) {
        super(grade);
    }
}
class TestSyntaxStudentException {
    static void validate(int grade) throws SyntaxStudentException {
        if(grade>90) {
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        } else {
            System.out.println("You are a great student");
        }
    }

    public static void main(String[] args) {
        try {
            validate(95);
        } catch (SyntaxStudentException e) {
            e.printStackTrace();
        }
    }
}
