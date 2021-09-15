package com.syntax.Repl.Repl173;

abstract class Tea {
    String teaType;
    Tea(String teaType) {
        this.teaType=teaType;
    }
    abstract void addSugar();
}
