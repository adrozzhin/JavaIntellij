package com.syntax.class26.casting;

public class CastingDemo {

    public static void main(String[] args) {
        Object[]  objects = {"Hi",10,'A'};
        for (Object obj:objects) {
            System.out.println(((String)obj).length());
        }
    }
}
