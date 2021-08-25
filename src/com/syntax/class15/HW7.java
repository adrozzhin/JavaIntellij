package com.syntax.class15;

public class HW7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How would you swap  2 strings without a temporary variable?
		
		String str = "First string";
		String str2 = "Second String Long";
		
		System.out.println("First string before swap: " + str);
		System.out.println("Second string before swap: " + str2);
		System.out.println("--------");
		
		str = str.concat(str2);
		
		str2 = str.replace(str2, "");
		str = str.replace(str2, "");
		

		System.out.println("Swapped first string: " + str);
		System.out.println("Swapped second string: " + str2);

	}

}
