package com.syntax.class31;

import java.util.*;

public class MapRecap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Oxana");
        map.put(256, "John");
        map.put(986, "Jane");
        map.put(455, "Mike");
        map.put(455, "Liza");
        map.put(null, null);
        map.put(null, "Josh");
        System.out.println("----------HashMap----------");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map);
        System.out.println("----------LinkedHashMap----------");
        Map<Integer, String> lmap = new LinkedHashMap<>();
        lmap.put(101, "Oxana");
        lmap.put(256, "Oxana");
        lmap.put(986, null);
        lmap.put(455, "Mike");
        lmap.put(455, "Liza");
        lmap.put(null, null);
        lmap.put(null, "Josh");

        System.out.println(lmap);

        System.out.println("----------TreeMap----------");
        Map<Integer, String> tmap = new TreeMap<>();
        tmap.put(101, "Oxana");
        tmap.put(256, "Oxana");
        tmap.put(986, null);
        tmap.put(455, "Mike");
        tmap.put(455, "Liza");
       // tmap.put(null, null); //TreeMap does not allow null keys
       // tmap.put(null, "Josh");

        System.out.println(tmap);

        System.out.println("----------Hashtable----------");

        Map<Integer, String> htable = new Hashtable<>();
        htable.put(190, "Jack");
        htable.put(80, null);

        System.out.println(htable);

        System.out.println(tmap.get(90));



    }
}
