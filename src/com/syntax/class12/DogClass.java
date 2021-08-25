package com.syntax.class12;

public class DogClass {

	String breed;
	String name;
	String color;

	void bark() {
		System.out.println(breed + " can bark");
	}

	void run() {
		System.out.println(breed + " can run");
	}

	void play() {
		System.out.println(breed + " can play");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogClass dog1 = new DogClass();
		dog1.breed = "Husky";
		dog1.name = "John";
		dog1.color = "grey";
		dog1.bark();
		dog1.run();
		dog1.play();
		DogClass dog2 = new DogClass();
		dog2.breed = "Bulldog";
		dog2.name = "Bob";
		dog2.color = "blue";
		dog2.bark();
		dog2.run();
		dog2.play();
		DogClass dog3 = new DogClass();
		dog3.breed = "Labrador";
		dog3.name = "Buddy";
		dog3.color = "red";
		dog3.bark();
		dog3.run();
		dog3.play();
	}

}
