package com.syntax.class27HW.Task3;
/*
Create  a  Class  Car  that  would  have  the following  fields:  carPrice  and  color  and method calculateSalePrice()
which should be returning a price of the car.Create 2 sub classes: Sedan and Truck.
The Truck  class  has  field  as  weight  and  has  its own implementation of calculateSalePrice() method in which
returned price calculated as following: if weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.The Sedan class has field as length and also does its own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount,
otherwise 10% discount
 */
public abstract class Car {
    int carPrice;
    String color;
    abstract void calculateSalePrice();
}
class Truck extends Car {
    int weight;

    Truck(int weight,int carPrice) {
        this.weight=weight;
        this.carPrice = carPrice;
    }

    @Override
    void calculateSalePrice() {
        double discount;
        if(weight>2000) {
         discount = 0.1;
        } else {
            discount = 0.2;
        }
        System.out.println("Sale price for Truck with MSRP: "+carPrice+"$ and weight: "+ weight +
                "kg is "+(carPrice-(carPrice*discount) + "$, based on discount: "+discount*100+"%"));
    }
}
class Sedan extends Car {
    int length;

    Sedan(int length,int carPrice) {
        this.length=length;
        this.carPrice = carPrice;
    }

    @Override
    void calculateSalePrice() {
        double discount;
        if(length>20) {
            discount = 0.05;
        } else {
            discount = 0.1;
        }
        System.out.println("Sale price for Sedan with MSRP: "+carPrice+"$ and length: "+ length +
                "feet is "+(carPrice-(carPrice*discount) + "$, based on discount: "+discount*100+"%"));
        }
    }

