package com.syntax.class18HW;

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Brown");
        book1.printInfo();
        Book book2 = new Book("Lord of the Rings", 100,
                "Black");
        book2.printInfo();
    }
}
