package com.syntax.class31HW;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

Retrieve all keys and values from a Best Buy map using EntrySet.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BestBuy {
    public static void main(String[] args) {
        Map<Integer, String> bbStore = new HashMap<>();
        bbStore.put(8644533, "Laptop");
        bbStore.put(2184121, "TV");
        bbStore.put(9989522, "Fridge");
        bbStore.put(6851215, "Oven");
        bbStore.put(7875646, "Iphone");

        Set<Map.Entry<Integer, String>> storeSet = bbStore.entrySet();

        for (Map.Entry item: storeSet
             ) {
            System.out.println(item);
        }
    }
}
