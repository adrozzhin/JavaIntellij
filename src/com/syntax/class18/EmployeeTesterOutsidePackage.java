package com.syntax.class18;

import com.syntax.class18HW.Employee;

public class EmployeeTesterOutsidePackage extends Employee{
    public static void main (String[] args) {

        Employee employee3 = new Employee();
        employee3.printEmployeeInfo();

    }
}
