package com.syntax.Repl;

import java.io.*;
import java.util.*;

public class Repl213 {
    public static void tempChecker(int temp)  {
        if(temp<32) {
            throw new RuntimeException("It is freezing");
        } else {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        tempChecker(30);
    }
}
