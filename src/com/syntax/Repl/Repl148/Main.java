package com.syntax.Repl.Repl148;

public class Main {
    public static void main(String[] args) {
        ShoppingStore item1 = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore item2 = new ShoppingStore("Mattress", 62.74, 7);
        item1.itemTotalPrice();
        item2.itemTotalPrice();
        //System.out.println(ShoppingStore.noOfObjects);

        double summary = item1.totalPrice + item2.totalPrice;
        System.out.println("You purchased " + summary + " Today");
    }
}
