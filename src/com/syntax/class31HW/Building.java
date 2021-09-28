package com.syntax.class31HW;

/*
Create a map of a building. Store floor number and it is associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */

import java.util.Map;
import java.util.TreeMap;

public class Building {
    public static void main(String[] args) {
        Map<Integer, String> building = new TreeMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Netflix");
        building.put(4, "Adobe");
        building.put(5, "Amazon");
        building.put(6, "Syntax");
        building.put(7, "Google");
        building.put(5, "Tesla");
        System.out.println("A size of the building is: " + building.size());
        System.out.println(building);
        building.replace(4, "AirBnb");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);
    }
}
