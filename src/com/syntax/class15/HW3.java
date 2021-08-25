package com.syntax.class15;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * You have a String a=�Is it saturday? 
		 * Is it raining? Do we have a Java Class today?� How would you find out how many sentences are in that String?
		 */
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today. Yes, we have";
		
		//String[] arr = a.split("[\\p{Punct}]");
		System.out.println(a.split("[?.!]").length);
		
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		int x;
//		System.out.println(x=arr.length);
		

	}

}
