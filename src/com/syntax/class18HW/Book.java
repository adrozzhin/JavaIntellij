package com.syntax.class18HW;

public class Book {

    /*
    Write program as a Book class that will have instance variables
    and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    String title;
    int price;
    String coverColor;

    Book(String bookTitle, int bookPrice, String bookCoverColor) {
        coverColor = bookCoverColor;
        price = bookPrice;
        title = bookTitle;
    }

    Book(String bookTitle, String bookCoverColor) {
        coverColor = bookCoverColor;
        price = 50;
        title = bookTitle;
    }
    void printInfo() {
        System.out.println("Title: " + title + " Cover color: "
                + coverColor + " Price: "+ price);
    }

}
