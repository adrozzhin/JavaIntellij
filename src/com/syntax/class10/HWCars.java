package com.syntax.class10;

public class HWCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cars[][] = { { "dodge", "ford", "jeep" }, { "BMW", "VW", "mercedes" }, { "kia", "hyundai", "genesis" },
				{ "alfa romeo", "fiat", "ferrari" } };
		for (int i=0; i<cars.length; i++) {
			for (int j=0;j<cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
		for (String [] car:cars) {
			for (String make:car) {
				System.out.print(make + " ");
			}
			System.out.println();
		}

	}

}
