package com.syntax.reviewclass11;

public interface Finance {
    void takeCredit();
}

interface FederalBank extends Finance {
    void checkBalanceInFederalBank();
    void checkInterestAmountInFederalBank();

    static void depositMoney() {
        System.out.println("Money is deposited in federal bank");
    }
}

class AllyBank{
    public void emiPolicy() {
        System.out.println("Here you will get all the EMI info");
    }
}

class PNC extends AllyBank implements FederalBank {

    @Override
    public void takeCredit() {
        System.out.println("It checks credit");
    }

    @Override
    public void checkBalanceInFederalBank() {
        System.out.println("It checks balance");
    }

    @Override
    public void checkInterestAmountInFederalBank() {
        System.out.println("It checks interest");
    }
}