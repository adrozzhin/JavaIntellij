package com.syntax.Repl;

import java.util.LinkedList;

public class Repl190 {
    public static void main(String []args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        for (int i = 2; i < 11; i++) {
            linkedList.add(i, linkedList.get(i-1)+ linkedList.get(i-2));
        }
        System.out.println(linkedList);
    }
}
