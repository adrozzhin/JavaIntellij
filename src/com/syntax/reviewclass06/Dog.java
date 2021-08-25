package com.syntax.reviewclass06;

public class Dog {
	
	String name;
	String breed;
	String color;
	int age;
	char gender;
	double height;
	int weight;
	
	void bark() {
		System.out.println("Dog can bark");
	}
	void sleep() {
		System.out.println("Dog can sleep");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.name= "Jerry";
		dog1.color = "brown";
		dog1.breed = "Labra";
		dog1.age = 21;
		dog1.height = 20;
		dog1.gender='M';
		dog1.weight= 43;
		dog1.bark();
		dog1.sleep();
		
		Dog dog2 = new Dog();
		dog2.name= "Tommy";
		dog2.color = "black";
		dog2.breed = "Buldog";
		dog2.age = 5;
		dog2.height = 15;
		dog2.gender='F';
		dog2.weight= 29;
		dog2.bark();
		dog2.sleep();
		
		
		
		
		

	}

}
