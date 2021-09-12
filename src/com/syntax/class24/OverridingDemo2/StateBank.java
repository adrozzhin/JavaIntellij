package com.syntax.class24.OverridingDemo2;

public class StateBank {
    double money;
    double fee;

    StateBank(double money) {
        this.money = money;
    }

    public void chargeFee() {
        if (money < 1000) {
            fee = money * 0.01;
        } else {
            fee = money * 0.02;
        }
    }
}

class BOA extends StateBank {
    BOA(double money) {
        super(money);
    }

    @Override
    public void chargeFee() {
        if (money < 500) {
            fee = money * 0.02;
        } else {
            fee = 0;
        }
    }
}

class Chase extends StateBank {
    Chase(double money) {
        super(money);
    }

    @Override
    public void chargeFee() {
        fee = 0;
    }
}
