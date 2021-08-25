package com.syntax.class13HW;

public class HW3Polindrome {
	
	//Create a method that will print whether given String 
	//is palindrome or not.
	
	void polindromeMethod (String word) {
		String reversed = "";
		for (int i=word.length()-1; i>=0;i--) {
			reversed = reversed + word.charAt(i);
		}
		if (reversed.equals(word)) {
			System.out.println("Word " + word + " is a polindrome");
		} else {
			System.out.println("Word " + word + " is NOT a polindrome");
		}
		
		
	}

}
