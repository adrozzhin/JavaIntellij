package com.syntax.class17;

public class AccessModifiersDemo1 {
    private String name;
    int age;
    protected String city;


    private void method1() {
        System.out.println(name);
        System.out.println(age);
    }
        void method2() {
            System.out.println(name);
            System.out.println(age);
            method1();
        }

    protected void method4() {
        System.out.println(name);
        System.out.println(age);
    }


    public static void main(String[] args) {
       // System.out.println(name); //because main is a static method
        AccessModifiersDemo1 accessModifiersDemo1 = new AccessModifiersDemo1();
        System.out.println(accessModifiersDemo1.name);
        System.out.println(accessModifiersDemo1.age);
        accessModifiersDemo1.method1();

        accessModifiersDemo1.method4();
    }
}
