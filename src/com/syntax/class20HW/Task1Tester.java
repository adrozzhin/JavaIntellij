package com.syntax.class20HW;

public class Task1Tester {
    public static void main(String[] args) {
        A a = new A();
        a.color = "Black";
        a.make = "BMW";
        a.model = "330ci";

        B b = new B();
        b.weight = 3000;
        b.price = 20000;

        C c = new C();
        c.isElectric = true;
        c.weight = 4000;
        //c.color /error
    }
}
