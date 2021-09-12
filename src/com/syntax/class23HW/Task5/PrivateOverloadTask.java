package com.syntax.class23HW.Task5;

public class PrivateOverloadTask {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void sayHello() {
        System.out.println("Hello there");
    }
    private void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    private void sayHello(String name, int times) {
        for (int i=0;i<times; i++) {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        PrivateOverloadTask privateOverloadTask = new PrivateOverloadTask();
        privateOverloadTask.sayHello();
        privateOverloadTask.sayHello("Andrei");
        privateOverloadTask.sayHello("Andrei", 3);



    }
}
