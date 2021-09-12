package com.syntax.class25HW;

public class ComputerTester {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Apple apple = new Apple();
        Lenovo lenovo = new Lenovo();
        HP hp = new HP();
        Dell dell = new Dell();
        Computer[] brands = {computer, apple, lenovo, hp, dell};
        for (int i=0;i<brands.length;i++) {
            testAllComputers(brands[i]);
            if (brands[i] == apple) {
                apple.SafariBrowser();
            } else if (brands[i] == lenovo) {
                lenovo.TouchScreen();
            } else if (brands[i] == hp) {
                hp.AluminumCase();
            } else if (brands[i] == dell) {
                dell.FourKDisplay();
            }
            System.out.println();
        }
    }
    static void testAllComputers (Computer computer) {
        computer.browseInternet();
        computer.playGames();
        computer.AccessToIDE();
    }
}
