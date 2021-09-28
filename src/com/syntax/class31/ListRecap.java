package com.syntax.class31;

import java.util.*;

public class ListRecap {
    public static void main(String[] args) {
        List<String> grocery = new ArrayList<>();
        grocery.add("Milk");
        grocery.add("Cheese");
        grocery.add("Eggs");
        grocery.add("Butter");
        grocery.add("Butter");

        for (String item: grocery
             ) {
            System.out.println(item);
        }
        System.out.println("-------------");
        for (int i = 0; i < grocery.size(); i++) {
            System.out.println(grocery.get(i));
        }
        System.out.println("-------------");
        Iterator<String> iterator = grocery.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        Set<String> car = new TreeSet<>();
        car.add("BMW");
        car.add("Kia");
        car.add("Toyota");
        car.add("BMW");
        car.add("Honda");

        System.out.println(car.size());
        System.out.println(car);

        List<String> carCopy = new ArrayList<>(car);
        System.out.println(carCopy);
        System.out.println(carCopy.get(0));

        List<String> carCopy2 = new ArrayList<>();
        carCopy2.addAll(car);
        System.out.println(carCopy);
        System.out.println(carCopy.get(0));

        Iterator<String> it = car.iterator();
        String c = it.next();
        System.out.println(c);
        System.out.println("**************");
        String cc = car.iterator().next();
        System.out.println(cc);
        carCopy2.add("Honda");
        carCopy2.add("Honda");
        carCopy2.add("Toyota");
        System.out.println(carCopy2);

        Set<String> myCars = new LinkedHashSet<>();
        myCars.addAll(carCopy2);
        System.out.println(myCars);




    }
}
