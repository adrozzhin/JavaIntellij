package com.syntax.class10;

public class TaskCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String countries[] = { "USA", "Canada", "Italy", "Spain", "Thailand", "Portugal" };
		String capital = null;
		for (String country : countries) {
			if (country.equals("USA")) {
				capital = "Washington DC";
			} else if (country.equals("Canada")) {
				capital = "Ottawa";
			} else if (country.equals("Italy")) {
				capital = "Rome";
			} else if (country.equals("Spain")) {
				capital = "Madrid";
			} else if (country.equals("Thailand")) {
				capital = "Bangkok";
			} else {
				capital = "Uknown";
			}

			System.out.println("The capital of " + country + " is " + capital);
	
			}

		}
	}

