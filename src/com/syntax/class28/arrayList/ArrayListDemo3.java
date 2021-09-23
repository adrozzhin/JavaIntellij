package com.syntax.class28.arrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Andrei");
        arrayList.add("JOhn");
        arrayList.add("Mick");
        arrayList.add("Jane");
        arrayList.add("JOhn");
        System.out.println(arrayList);
        arrayList.add(2,"Serge");
        System.out.println(arrayList);


    }
}
