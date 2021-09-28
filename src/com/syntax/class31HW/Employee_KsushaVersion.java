package com.syntax.class31HW;

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */

import java.util.*;

public class Employee_KsushaVersion {
    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Mike B", 80000);
        employeeMap.put("John C", 90000);
        employeeMap.put("Steve V", 70000);
        employeeMap.put("Jane R", 50000);
        employeeMap.put("Jack H", 12222222);
        employeeMap.put("Jack E", 65000);

        int maxSalary = 0;
        String maxName = "";

        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if(value>maxSalary){
                maxSalary=value;
                maxName = key;
            }
        }
        System.out.println(maxName + "=$" + maxSalary);
    }
}

