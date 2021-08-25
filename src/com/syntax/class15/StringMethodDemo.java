package com.syntax.class15;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am a good tester. I am a good person";
		System.out.println(str);
		System.out.println(str.replace("a", "A"));
		System.out.println(str.replace("good", "best"));
		System.out.println(str);
		
		String str2 = "trhsfdgerg8345r9e890d8uf23@#$&#&";
		System.out.println(str2.replaceAll("[0-9]", "+")); // will replace all the numbers from 0-9 in the string
		System.out.println(str2.replaceAll("[a-z]", "*")); // will replace all the lowercase letters from the original string
		System.out.println(str2.replaceAll("[a-z0-9]", "")); // will remove all the lower case letters and numbers
		System.out.println(str2.replaceAll("[a-z5-9A-Z]", ""));
		System.out.println(str2.replaceAll("[^a-z5-9A-Z]", "*"));
		
	}

}
