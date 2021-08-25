package com.syntax.class14;

public class Task3 {
	
	//Create a String and if the String is not empty perform the following: 
	//if the String has an odd number of characters and has 3 or more characters, 
	//print the character in the middle of the String.
	
	void chInside (String str) {
		
		if (str.isEmpty()) {
			System.out.println("Empty input");
		} else {
			if (str.length()%2==0) {
				System.out.println("String length is even. Put odd length string");
			} else if (str.length()<3) {
				System.out.println("String is too short");
			} else {
				System.out.println(str.charAt(str.length()/2));
			}
		}
		
		
		
	}

}
