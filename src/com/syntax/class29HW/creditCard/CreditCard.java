package com.syntax.class29HW.creditCard;

/*
Create a Card class that will have implemented  and unimplemented methods
and a constructor that will initializes credit card type. Create 3 subclasses of a Card card.
Create 3 objects of different card and store them into LinkedList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */

public abstract class CreditCard {
    String type;
    String bank;
    public abstract void cashBack();
    public void pay() {
        System.out.println("You can pay with "+bank + " " + type + " credit card");
    }
    public CreditCard(String type, String bank) {
        this.bank = bank;
        this.type = type;
    }
}
class Visa extends CreditCard {
    Visa(String type, String bank) {
        super(type, bank);
    }

    @Override
    public void cashBack() {
        System.out.println(bank + " credit card has a cashback");
    }
}
class Mastercard extends CreditCard {
    Mastercard(String type, String bank) {
        super(type, bank);
    }

    @Override
    public void cashBack() {
        System.out.println(bank + " credit card has NOT a cashback ");
    }
}
class AmericanExpress extends CreditCard {
    AmericanExpress(String type, String bank) {
        super(type, bank);
    }

    @Override
    public void cashBack() {
        System.out.println(bank + " credit card MAY has a cashback");
    }
}
