package com.syntax.class31;

import java.util.*;

public class AllValuesFromMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Oxana");
        map.put(256, "John");
        map.put(986, "Jane");
        map.put(455, "Mike");
        map.put(455, "Liza");

        Collection<String> val = map.values();
        for (String str: val
             ) {
            System.out.println(str);
        }
        System.out.println("-------------");
        Iterator<String> it = val.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("------Getting all keys -------");

        Set<Integer> keys = map.keySet();

        for (int key:keys
             ) {
            System.out.println(key + "----" +map.get(key));
        }

        Iterator<Integer>  iter = keys.iterator();
        while (iter.hasNext()) {
            int key = iter.next();
            System.out.println(key + "------" + map.get(key));
        }

        Set<Map.Entry<Integer, String>> setEntr = map.entrySet();

        for (Map.Entry<Integer, String> entry: setEntr
             ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("-------------");
        Iterator<Map.Entry<Integer,String>> it2 = setEntr.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer,String> e = it2.next();
            System.out.println(e.getKey() + " " +e.getValue());
        }


    }
}
