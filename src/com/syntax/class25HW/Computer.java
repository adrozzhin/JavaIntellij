package com.syntax.class25HW;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    void browseInternet() {System.out.println("Computer can browse in internet");}
    void playGames() {System.out.println("Computer can play games");}
    void AccessToIDE() {System.out.println("Computer have access to IDE");}
}
class Apple extends Computer {
    void browseInternet() {System.out.println("Apple Computer can browse in internet");}
    void playGames() {System.out.println("Apple Computer can play games");}
    void AccessToIDE() {System.out.println("Apple Computer have access to IDE");}
    void SafariBrowser() {System.out.println("***Apple computer have Safari browser by default***");}
}
class Lenovo extends Computer {
    void browseInternet() {System.out.println("Lenovo Computer can browse in internet");}
    void playGames() {System.out.println("Lenovo Computer can play games");}
    void AccessToIDE() {System.out.println("Lenovo Computer have access to IDE");}
    void TouchScreen() {System.out.println("***Lenovo Computer have touchscreen***");}
}
class HP extends Computer {
    void browseInternet() {System.out.println("HP Computer can browse in internet");}
    void playGames() {System.out.println("HP Computer can play games");}
    void AccessToIDE() {System.out.println("HP Computer have access to IDE");}
    void AluminumCase() {System.out.println("***HP Computer has aluminum case***");}
}
class Dell extends Computer {
    void browseInternet() {System.out.println("Dell Computer can browse in internet");}
    void playGames() {System.out.println("Dell Computer can play games");}
    void AccessToIDE() {System.out.println("Dell Computer have access to IDE");}
    void FourKDisplay() {System.out.println("***Dell Computer has 4K display***");}
}