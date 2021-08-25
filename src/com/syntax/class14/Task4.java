package com.syntax.class14;

public class Task4 {
	
	//Create a String and print it in reverse order (Sunday → yadnuS).
	
	void Reverse (String str) {
		String temp = "";
		for (int i=str.length()-1; i>=0; i--) {
			temp = temp + str.charAt(i);
		}
			
		System.out.println(temp);	
	}
	

}
