package com.syntax.Repl;


import java.util.Iterator;
import java.util.LinkedList;

public class Repl191 {

    static LinkedList<Integer> isPrimeList(LinkedList<Integer> list) {

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num ==0 || num ==1) {
                iterator.remove();
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        iterator.remove();
                        break;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(isPrimeList(list));

    }


//    static boolean isPrime (int num) {
//        //int counter = 0;
//        if (num == 1) {
//            return false;
//        } else {
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
//    public static void main(String[]args) {
//        LinkedList<Integer> prime = new LinkedList<>();
//
//        for (int num = 1; num <= 100; num++) {
//            if (isPrime(num)==true) {
//                prime.add(num);
//            }
//        }
//        System.out.println(prime);
//    }
}
