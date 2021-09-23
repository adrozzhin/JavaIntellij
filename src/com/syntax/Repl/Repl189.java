package com.syntax.Repl;

import java.util.Iterator;
import java.util.LinkedList;

public class Repl189 {
    public static void main(String []args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=50; i<=100;i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            int num = iterator.next();
            if(num%3!=0) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
