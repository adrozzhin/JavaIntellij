package com.syntax.reviewclass07;

public class MethodDemo3 {
    public static void main(String[] args) {
        //regex
        String name = "Softw@re testing";
        System.out.println(name.replaceAll("[^\\w]", "a"));

        String test = "sdfvdRGSDGDFEFEGD459256286#*&%Y(#*%&&#^@%*";
        System.out.println(test.replaceAll("[0-9]", "*"));
        System.out.println(test.replaceAll("[A-Z]", "*"));
        System.out.println(test.replaceAll("[a-z]", "*"));
        System.out.println("------------------");
        System.out.println(test.replaceAll("[a-z0-9]", "*"));
        System.out.println(test.replaceAll("[a-z0-9A-Z]", "*"));
        System.out.println(test.replaceAll("[^a-z0-9A-Z]", "*"));

    }
}
