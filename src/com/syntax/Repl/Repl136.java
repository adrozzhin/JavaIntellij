package com.syntax.Repl;

public class Repl136 {

    private void First() {
        System.out.println("This is Private Method");
    }

    void Second() {
        System.out.println("This is Default Method");
    }

    protected void Third() {
        System.out.println("This is Protected Method");
    }

    public void Fourth() {
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        Repl136 repl136 = new Repl136();
        repl136.First();

    }

}
