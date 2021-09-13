package com.syntax.class27HW.Task4Diagram;

public interface WebDriver {
    void open();
    void close();
    String getTitle();

}

interface TakesScreenShot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenShot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Chrome Driver opens browser");
    }

    @Override
    public void close() {
        System.out.println("Chrome Driver closes browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot in Chrome Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Chrome Driver navigates throw browser");
    }

}
class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Firefox Driver opens browser");
    }

    @Override
    public void close() {
        System.out.println("Firefox Driver closes browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot in Firefox Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Firefox Driver navigates throw browser");
    }
}
class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Safari Driver opens browser");
    }

    @Override
    public void close() {
        System.out.println("Safari Driver closes browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot in Safari Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Safari Driver navigates throw browser");
    }

}
