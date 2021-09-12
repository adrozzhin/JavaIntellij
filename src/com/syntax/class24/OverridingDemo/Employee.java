package com.syntax.class24.OverridingDemo;

public class Employee {
    double salary;
    String name;
    Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }
    void getPaid() {
        System.out.println(name + " is getting paid " + salary + "/annually");
    }
}

class  Contractor extends Employee {

    Contractor(String name, double salary) {

        super(name, salary);
    }

    @Override
    void getPaid() {
        System.out.println(name + " is getting paid " + salary + "/hourly");
    }
}
class  FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Andrei", 100000);
        fullTimeEmployee.getPaid();
        Contractor contractor = new Contractor("Dilnoza", 50);
        contractor.getPaid();
    }
 }
