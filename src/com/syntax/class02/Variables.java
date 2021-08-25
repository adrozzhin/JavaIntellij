package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Andrei";
		String lastname = "Drozzhin";
		char grade = 'A';
		String city = "Carmichael";
		String state = "CA";
		String phone = "(111)222 33 44";
		
		System.out.println("My name is " + name + " and last name is " + lastname);
		System.out.println("I am " + grade + " student");
		System.out.println("I live in city " + city + " and state " + state);
		System.out.println("And my phone number is " + phone);
		
		city = "Denver";
		state = "Colorado";
		phone = "(222)333 44 55";
		grade = 'B';
		
		System.out.println("My name is " + name + " and I moved to new city " + city + " and new state " + state + ". My new phone number is " + phone);
		
		
		
	}

}
