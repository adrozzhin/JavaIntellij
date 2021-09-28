package com.syntax.class31HW.Person;

import java.util.*;

public class PersonTester {
    public static void main(String[] args) {
        Map<Integer, Person> personMap = new TreeMap<>();
        Person p1 = new Person("Andrei", "Drozzhin", 30, 150000);
        Person p2 = new Person("Jack", "Richer", 40, 100000);
        Person p3 = new Person("Steve", "Moore", 50, 120000);
        personMap.put(123, p1);
        personMap.put(985, p2);
        personMap.put(547, p3);

        Collection<Person> people = personMap.values();

        Iterator it = people.iterator();
        while (it.hasNext()) {
            Person person = (Person) it.next();
            person.printInfo();
        }

    }
}
