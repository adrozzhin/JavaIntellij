package com.syntax.class17;

public class AccessModifiersDemo1Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 accessModifiersDemo1 = new AccessModifiersDemo1();
        // System.out.println(accessModifiersDemo1.name); cannot access because field is private

        accessModifiersDemo1.method4();
    }
}
