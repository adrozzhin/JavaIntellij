package com.syntax.Repl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Repl187 {
    public static void main(String []args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("yo");
        arrayList.add("sup");
        arrayList.add("yolo");
        arrayList.add("boop");
        System.out.println(arrayList);

        for (int i=arrayList.size()-1; i>=0; i-=2) {
            arrayList.remove(i);

        }
        System.out.println(arrayList);

    }
}
