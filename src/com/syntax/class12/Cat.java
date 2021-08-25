package com.syntax.class12;

public class Cat {
	
	String name;
	String color;
	int age;
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat();
		cat1.name = "Tom";
		cat1.color = "Black";
		cat1.age = 3;
		cat1.eat();
		cat1.sleep();
		
		Cat cat2 = new Cat();
		cat2.name = "Jerry";
		cat2.color = "grey";
		cat2.age = 2;
		cat2.sleep();
		

	}

}
