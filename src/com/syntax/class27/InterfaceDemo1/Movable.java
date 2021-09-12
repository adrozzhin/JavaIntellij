package com.syntax.class27.InterfaceDemo1;

public interface Movable {
    void move();
}
interface ControlAble {
    void control();
}
interface SellAble {
    void sell();
}
interface AnotherInterface{
    void sell();
}
interface Car extends Movable,ControlAble, SellAble, AnotherInterface {

}
class Toyota implements Movable,ControlAble, SellAble, AnotherInterface {


    @Override
    public void move() {
        System.out.println("You can move Toyota");
    }

    @Override
    public void control() {
        System.out.println("You can control Toyota");
    }

    @Override
    public void sell() {
        System.out.println("You can sell Toyota");
    }
}