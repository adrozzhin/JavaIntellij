package com.syntax.class26.abstractionDemo;

public abstract class Phone {
    public void makePhoneCall() {
        System.out.println("Calling");
    }

    public void sendSMS() {
        System.out.println("Sending messages");
    }

    public abstract void takePictures();

    public abstract void unlock();
}
class Iphone extends Phone {

    @Override
    public void takePictures() {
        System.out.println("Take pictures with 12 MP camera");
    }

    @Override
    public void unlock() {
        System.out.println("unlocks with face id");
    }
}
class Samsung extends Phone {
    @Override
    public void takePictures() {
        System.out.println("Take pictures with 108 MP camera");
    }

    @Override
    public void unlock() {
        System.out.println("unlocks with fingerprint");
    }
}


