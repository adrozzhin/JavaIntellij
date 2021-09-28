package com.syntax.class31HW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employee_EugeneVersion {
    public static void main(String[] args) {
        Map<String, Double> employee = new HashMap<>();
        employee.put("Jamil", 10.0);
        employee.put("Michael", 15000.0);
        employee.put("Sharif", 10000.0);
        employee.put("Eugene", 144999.0);
        employee.put("Olena", 8889898800.0);

        Double maxVal = 0.0;
        String maxKey = "";
        Set<Map.Entry<String, Double>> empEntry = employee.entrySet();
        Iterator<Map.Entry<String, Double>> iterator = empEntry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> element = iterator.next();
            Double val = element.getValue();
            String key = element.getKey();
            if (val > maxVal) {
                maxVal = val;
                maxKey=key;
            }
        }
        System.out.println(maxKey + "=$"+maxVal);
    }
}
