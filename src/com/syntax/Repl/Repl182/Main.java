package com.syntax.Repl.Repl182;

public class Main {
    public static void main (String []args) {
        Person person = new Person("John","Doe", 10,25,1990,"123-45-6789");
        System.out.println(person.getFirstname());
        System.out.println(person.getLirstname());
        person.formatBirthday();
        System.out.println(person.getSsn());
        System.out.println(person.birthyear);

    }
}
