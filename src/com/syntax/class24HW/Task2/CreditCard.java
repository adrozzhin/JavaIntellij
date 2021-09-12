package com.syntax.class24HW.Task2;
/*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
public class CreditCard {
    double balance;
    double interestRate;
    CreditCard(double balance) {
        this.balance = balance;
    }
    void calculateInterest() {
        interestRate = balance*0.15;
        System.out.println("Yearly interest is " + interestRate);
    }
}
class  Visa extends CreditCard {
    Visa(double balance) {
        super(balance);
    }
//    void calculateInterest() {
//        interestRate = balance*0.12;
//        System.out.println("Yearly interest is " + interestRate);
//    }
}
class AX extends CreditCard {
    AX(double balance) {
        super(balance);
    }
    @Override
    void calculateInterest() {
        interestRate = balance*0.1;
        System.out.println("Yearly interest is " + interestRate);
    }
}
