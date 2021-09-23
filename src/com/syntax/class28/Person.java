package com.syntax.class28;

public class Person {
    private String name;
    private int age;
    private String SSN;
    void setName(String name) {
        if (name.length()<20) {
            this.name=name;
        } else {
            System.out.println("Name is too long");
        }
    }
    void setAge (int age) {
        if(age>0 && age<120) {
            this.age=age;
        } else {
            System.out.println("age should be 0 to 120");
        }
    }
    void setSSN (String SSN) {
        if (SSN.length()==9) {
            this.SSN=SSN;
        } else {
            System.out.println("Wrong length of SSn");
        }
    }
    String getName() {
        return name;
    }
    int getAge(String SSN) {
        if(this.SSN.equals(SSN)) {
            return age;
        } else {
            return 0;
        }
    }
    String getSSN (String password) {
        if(password.equals("12345")) {
            return SSN;
        } else {
            return null;
        }
    }
}
