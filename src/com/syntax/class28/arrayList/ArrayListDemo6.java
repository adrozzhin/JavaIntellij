package com.syntax.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Andrei");
        list.add("John");
        list.add("Mick");
        list.add("John");
        list.add("Jane");
        list.add("John");
        list.add("Ane");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Jane");
        list1.add("John");
        list1.add("Ane");
        list.removeAll(list1);
        System.out.println(list);
    }
}
