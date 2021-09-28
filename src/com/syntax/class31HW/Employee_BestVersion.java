package com.syntax.class31HW;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Employee_BestVersion {
    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Mike B", 80000);
        employeeMap.put("John C", 90000);
        employeeMap.put("Steve V", 70000);
        employeeMap.put("Jane R", 50000);
        employeeMap.put("Jack H", 12222222);
        employeeMap.put("Jack E", 65000);

        Integer highestSalary = (Collections.max(employeeMap.values()));
        for (Map.Entry<String, Integer> entry: employeeMap.entrySet()
             ) {
            if(entry.getValue()==highestSalary) {
                System.out.println(entry.getKey() + "=$" + entry.getValue());
            }
        }
    }
}
