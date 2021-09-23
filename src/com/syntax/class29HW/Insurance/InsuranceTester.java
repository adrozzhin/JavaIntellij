package com.syntax.class29HW.Insurance;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Progressive", "BMW"));
        insurances.add(new Car("Geico", "Mercedes"));
        insurances.add(new Car("Travelers", "Honda"));

        insurances.add(new Pet("Kaiser", "Cat"));
        insurances.add(new Pet("PetInsurance", "Dog"));
        insurances.add(new Pet("SlowInsurance", "Turtle"));

        insurances.add(new Health("Signa"));
        insurances.add(new Health("Mercy"));
        insurances.add(new Health("Dignity"));

        for (Insurance insuranceObject: insurances
             ) {
            insuranceObject.getQuote();
            insuranceObject.cancelInsurance();
        }

    }
}
