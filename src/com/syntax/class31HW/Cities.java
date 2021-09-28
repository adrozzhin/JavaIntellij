package com.syntax.class31HW;
/*
Create a Map from array of cities that will sort keys in alphabetical order.
As a key store the name of the city and as a value store the length of the city
(Example: Paris=5, Moscow =6, Washington DC=13 etc..).
If any city name is more than 7 characters remove that city .
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Cities {
    public static void main(String[] args) {
        String[] cityList = {"Paris", "Madrid", "Sacramento", "Los Angeles", "Rome"};
        Map<String, Integer> cityMap = new TreeMap<String, Integer>();

        for (int i = 0; i < cityList.length; i++) {
            cityMap.put(cityList[i], cityList[i].length());
        }
        System.out.println(cityMap);
        Set<Map.Entry<String, Integer>> citySet= cityMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = citySet.iterator();
        while (iterator.hasNext()) {
            Integer length = iterator.next().getValue();
            if (length>7) {
                iterator.remove();
            }
        }
        System.out.println(cityMap);
    }
}
