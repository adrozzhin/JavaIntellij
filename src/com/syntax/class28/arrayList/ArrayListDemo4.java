package com.syntax.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abc");
        list.add("def");
        list.add("hty");
        list.add("hjh");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("mars");
        list1.add("eugene");
        list1.add("dilnoza");

        System.out.println(list);
        list.addAll(list1);
        System.out.println(list);

    }
}
