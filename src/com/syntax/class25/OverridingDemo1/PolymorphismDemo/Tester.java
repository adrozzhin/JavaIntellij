package com.syntax.class25.OverridingDemo1.PolymorphismDemo;

public class Tester {
    public static void main(String[] args) {
        WebDriver webDriver = new IE();
        WebDriver [] webDrivers = {new GoogleChrome(), new FireFox(),new Safari()};
        for (WebDriver drive: webDrivers) {
            testOnAllBrowsers(drive);
        }
    }
    static void testOnAllBrowsers(WebDriver webDriver) {
        webDriver.openBrowser();
        webDriver.loadWebsite("www.google.com");
        webDriver.Test1();
        webDriver.Test2();
        webDriver.closeBrowser();
    }
}
