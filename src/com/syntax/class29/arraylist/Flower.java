package com.syntax.class29.arraylist;

public abstract class Flower {
    String type;
    String color;
    public Flower(String type, String color) {
        this.type = type;
        this.color = color;
    }
    public abstract void bloom();
}
class Rose extends Flower{

    Rose(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(type +" blooms in May");
    }
}
class Tulip extends Flower {

    public Tulip(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(type+ " blooms in March");
    }
}
class Sunflower extends Flower {

    public Sunflower(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(type+ " blooms in June");
    }
}
