package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cars[] = { "Ford", "Toyota", "Honda", "BMW", "Jeep", "Dodge" };
		for (int i=0;i<cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		for (String car:cars) {
			System.out.print(car + " ");
		}

	}

}
