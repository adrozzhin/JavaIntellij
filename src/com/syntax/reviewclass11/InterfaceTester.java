package com.syntax.reviewclass11;

public class InterfaceTester {
    public static void main(String[] args) {
        Finance f = new PNC();
        f.takeCredit();

        FederalBank f2 = new PNC();
        f2.checkInterestAmountInFederalBank();
        f2.checkBalanceInFederalBank();
        f2.takeCredit();
    }

}
