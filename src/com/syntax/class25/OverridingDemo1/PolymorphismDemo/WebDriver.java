package com.syntax.class25.OverridingDemo1.PolymorphismDemo;

public class WebDriver {
    void openBrowser() {
        System.out.println("Opening browser");
    }
    void loadWebsite(String website) {
        System.out.println("load the website inside the browser");
    }
    void Test1() {
        System.out.println("Enter login info and check if you can login");
    }
    void Test2() {
        System.out.println("Click on buy button and make sure you can place an order");
    }
    void closeBrowser() {
        System.out.println("Testing file download");
    }
}
class GoogleChrome extends WebDriver {
    void openBrowser() { System.out.println("Opening browser in GoogleChrome");
    }
    void loadWebsite(String website) {
        System.out.println("load the website inside the browser using GoogleChrome");
    }
    void Test1() {
        System.out.println("Enter login info and check if you can login in GoogleChrome");
    }
    void Test2() {
        System.out.println("Click on buy button and make sure you can place an order in GoogleChrome");
    }
    void closeBrowser() {
        System.out.println("Testing file download in GoogleChrome");
    }
}
class FireFox extends WebDriver {
    void openBrowser() { System.out.println("Opening browser in FireFox");
    }
    void loadWebsite(String website) {
        System.out.println("load the website inside the browser using FireFox");
    }
    void Test1() {
        System.out.println("Enter login info and check if you can login in FireFox");
    }
    void Test2() {
        System.out.println("Click on buy button and make sure you can place an order in FireFox");
    }
    void closeBrowser() {
        System.out.println("Testing file download in FireFox");
    }
}
class Safari extends WebDriver {
    void openBrowser() { System.out.println("Opening browser in Safari");
    }
    void loadWebsite(String website) {
        System.out.println("load the website inside the browser using Safari");
    }
    void Test1() {
        System.out.println("Enter login info and check if you can login in Safari");
    }
    void Test2() {
        System.out.println("Click on buy button and make sure you can place an order in Safari");
    }
    void closeBrowser() {
        System.out.println("Testing file download in Safari");
    }
}
class IE extends WebDriver {
    void openBrowser() { System.out.println("Opening browser in IE");
    }
    void loadWebsite(String website) {
        System.out.println("load the website inside the browser using IE");
    }
    void Test1() {
        System.out.println("Enter login info and check if you can login in IE");
    }
    void Test2() {
        System.out.println("Click on buy button and make sure you can place an order in IE");
    }
    void closeBrowser() {
        System.out.println("Testing file download in IE");
    }
}