package com.syntax.class15;

public class HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How would you reverse a String word by word?
		
		String str = "This is a string variable";
		
		String arr[] = str.split(" ");
		
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
