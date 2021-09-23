package com.syntax.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abc");
        list.add("def");
        list.add("hty");
        list.add("hjh");

        for (String name: list
             ) {
            System.out.println(name);
        }
        System.out.println("-----------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
