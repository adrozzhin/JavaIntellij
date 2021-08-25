package com.syntax.class12;

public class Dog {
	
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void bark() {
		System.out.println("Dog can bark");
	}
	
	void sleep() {
		System.out.println("Dog can sleep");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1=new Dog();
		dog1.name="Bongo";
		dog1.breed="dalmatian";
		dog1.color="white";
		dog1.age=5;
		dog1.height=30;
		dog1.gender='M';
		
		dog1.bark();
		dog1.sleep();
		
		Dog dog2=new Dog();
		dog2.name ="Buddy";
		dog2.breed = "shitzu";
		dog2.color = "Blue";
		dog2.age = 10;
		dog2.height=10;
		dog2.gender='F';
		dog2.sleep();
		
				
		
	}

}
