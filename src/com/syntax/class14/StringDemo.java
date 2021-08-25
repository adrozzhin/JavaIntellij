package com.syntax.class14;

public class StringDemo {
	public static void main(String[] args) {
		
		String str = "Hello";
		
		String str2 = new String("Hello");
		System.out.println(str2.length());
		System.out.println(str.length());
		
		String name = "AnDrEi 123";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
				
		String firstName = "Andrei";
		String lastName = "Drozzhin";
		System.out.println(firstName.concat(" ").concat(lastName));
		int i = lastName.length();
		
	}

}
