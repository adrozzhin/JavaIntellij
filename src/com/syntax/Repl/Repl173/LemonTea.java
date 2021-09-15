package com.syntax.Repl.Repl173;

class LemonTea extends Tea{

    LemonTea(String teaType) {
        super(teaType);
    }
    void addSugar() {
        System.out.println("For "+ teaType+" we need 2 spoons of sugar");
    }
}
