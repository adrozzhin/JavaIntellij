package com.syntax.class27.Task1;

public interface WebDriver {
    /*

     */
    void openBrowser();
    void clodeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Open Chrome driver");
    }

    @Override
    public void clodeBrowser() {
        System.out.println("Close Chrome driver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Chrome window");
    }

    @Override
    public void findElement() {
        System.out.println("find elements in Chrome browser");
    }
}
class FireFoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Open FireFox driver");
    }

    @Override
    public void clodeBrowser() {
        System.out.println("Close FireFox driver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the FireFox window");
    }

    @Override
    public void findElement() {
        System.out.println("find elements in FireFox browser");
    }
}

