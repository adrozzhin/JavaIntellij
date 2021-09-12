package com.syntax.Repl.Repl148;

public class ShoppingStore {
    String item;
    double price;
    int quantity;
    double totalPrice;

    ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    void itemTotalPrice() {
        double totalPrice = price*quantity;
        this.totalPrice = totalPrice;
        System.out.println(item + " Total Value " + totalPrice);
    }


}
