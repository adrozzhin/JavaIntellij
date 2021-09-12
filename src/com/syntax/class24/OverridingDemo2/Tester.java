package com.syntax.class24.OverridingDemo2;

import com.syntax.class20HW.C;

public class Tester {
    public static void main(String[] args) {
        StateBank stateBank = new StateBank(1500);
        stateBank.chargeFee();
        System.out.println(stateBank.fee);

        BOA boa = new BOA(1500);
        boa.chargeFee();
        System.out.println(boa.fee);

        Chase chase =new Chase(1500);
        chase.chargeFee();
        System.out.println(chase.fee);
    }
}
