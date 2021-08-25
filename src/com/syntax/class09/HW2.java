package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String animals[] = {"Dog", "Cat", "Hippo", "Fox", "Gecco", "Rabbit" };
		for (int i=0; i<animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		for (String animal:animals) {
			System.out.print(animal + " ");
		}

	}

}
