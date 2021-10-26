package com.syntax.Repl;

import java.util.*;

public class Repl209 {
    public static void main(String[] args) {
        List<Map<String, Object>> dataList = new ArrayList<>();

        Map<String, Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);
        dataList.add(appleMap);

        Map<String, Object> orangeMap = new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        dataList.add(orangeMap);
        Double total = 0.0;

        for (int i = 0; i < dataList.size(); i++) {
            Map<String, Object> object = dataList.get(i);
            Double price = (Double) object.get("Price");

            Integer quantity = (Integer) object.get("Quantity");

            Double subTotal = price*quantity;

            Set<Map.Entry<String, Object>> set = object.entrySet();
            Iterator<Map.Entry<String, Object>> it = set.iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> entry = it.next();
                Double qDouble = null;
                if (entry.getValue().getClass().getName().contains("Integer")) {
                    String qStr = entry.getValue().toString();
                    qDouble = Double.valueOf(qStr);

                    System.out.print(entry.getKey() + ": " + qDouble + " ");
                } else {
                    System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
                }


            }
            System.out.print(" SubTotal " + subTotal);
            System.out.println();
            total = total + subTotal;
        }
        System.out.println("Your Purchase total : " + total);
    }
}

