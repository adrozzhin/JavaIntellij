package com.syntax.Repl.Repl173;

class ChaiTea extends Tea{
    ChaiTea(String teaType) {
        super(teaType);
    }

    void addSugar() {
        System.out.println("For "+ teaType+" we need 1 spoons of sugar");
    }
}
