package com.syntax.class26.abstractionDemo;

public class PhoneTester {
    public static void main(String[] args) {
      //  Phone phone = new Phone(); CE NOT possible to create object this way because Phone class is abstract


        Phone phone = new Iphone();
        phone.makePhoneCall();
        phone.sendSMS();
        phone.takePictures();
        phone.unlock();



    }
}
