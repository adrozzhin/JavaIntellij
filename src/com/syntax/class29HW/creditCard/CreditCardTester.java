package com.syntax.class29HW.creditCard;

import java.util.LinkedList;

public class CreditCardTester {
    public static void main(String[] args) {
        LinkedList<CreditCard> cards = new LinkedList<>();
        cards.add(new Visa("Visa", "BOA"));
        cards.add(new Mastercard("MasterCard", "Chase"));
        cards.add(new AmericanExpress("AmericanExpress", "American Express bank"));

        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).pay();
            cards.get(i).cashBack();
        }
    }
}
