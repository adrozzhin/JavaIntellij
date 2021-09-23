package com.syntax.class29HW.Insurance;
/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Insurance {
    String insuranceName;
    public abstract void getQuote();
    public abstract void cancelInsurance();
    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
}
class Car extends Insurance {
    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }
    @Override
    public void getQuote() {
        System.out.println("Get quote for CAR insurance from " + insuranceName + " for your " + carModel);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Cancel CAR insurance from " + insuranceName + " for your " + carModel);
    }
}
class Pet extends Insurance {
    String petType;
    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }
    @Override
    public void getQuote() {
        System.out.println("Get quote for PET insurance " + insuranceName + " for your " + petType);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Cancel PET insurance " + insuranceName + " for your " + petType);
    }
}
class Health extends Insurance {
    Health(String insuranceName) {
        super(insuranceName);
    }
    @Override
    public void getQuote() {
        System.out.println("Get quote for your Health insurance " + insuranceName);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Cancel your health insurance " + insuranceName);
    }
}

