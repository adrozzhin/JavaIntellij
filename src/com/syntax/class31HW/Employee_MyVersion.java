package com.syntax.class31HW;

import java.util.*;

public class Employee_MyVersion {
    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Mike B", 80000);
        employeeMap.put("John C", 90000);
        employeeMap.put("Steve V", 70000);
        employeeMap.put("Jane R", 50000);
        employeeMap.put("Jack H", 12222222);
        employeeMap.put("Jack E", 65000);

        List<Integer> employeeList = new ArrayList<>(employeeMap.values());
        int top = employeeList.get(0);

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) > top) {
                top = employeeList.get(i);
            }
        }
        Set<Map.Entry<String, Integer>> employeeSet = employeeMap.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = employeeSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < top) {
                iterator.remove();
            }
        }
        for (Map.Entry<String, Integer> onlyTopSalaryElement: employeeSet
             ) {
            System.out.println(onlyTopSalaryElement.getKey() + "=$" +onlyTopSalaryElement.getValue());
        }
    }
}

