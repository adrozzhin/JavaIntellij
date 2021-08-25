package com.syntax.class16HW;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.empID = "ABC123";
        employee1.salary = 100000;

        Employee employee2 = new Employee();
        employee2.empID = "CBA321";
        employee2.salary = 90000;

        System.out.println("Id of Employee 1 is :" + employee1.empID);
        System.out.println("Salary of Employee 1 is :" + employee1.salary);
        System.out.println("CEO of Employee 1 is :" + Employee.CEO);

        System.out.println("Id of Employee 2 is :" + employee2.empID);
        System.out.println("Salary of Employee 2 is :" + employee2.salary);
        System.out.println("CEO of Employee 2 is :" + Employee.CEO);
    }
}
