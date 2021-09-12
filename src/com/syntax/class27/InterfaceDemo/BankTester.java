package com.syntax.class27.InterfaceDemo;

public class BankTester {
    public static void main(String[] args) {
        Trustable trustable = new BOA();
        trustable.trust();

        BOA boa = new BOA();
        boa.hasSaving();
        boa.hasChecking();

        Bank bank = new BOA();
        bank.hasChecking();
        bank.hasCreditCard();
        bank.hasSaving();
        Bank.depositMoney();
    }
}
