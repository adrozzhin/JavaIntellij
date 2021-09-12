package com.syntax.class23HW.Task4;

import com.syntax.class17HW.Task3;

public class OverloadTask {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    static void sayHello() {
        System.out.println("Hello there");
    }
    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    static void sayHello(String name, int times) {
        for (int i=0;i<times; i++) {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Andrei");
        sayHello("Andrei", 2);


    }
}
