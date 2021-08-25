package com.syntax.class10;

public class More2dArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] food = { { "borsch", "vareniki", "draniki" }, { "kebabs", "palaw", "mantu" },
				{ "tacos", "burrito", "queso", "salsa" }, { "pasta", "pizza", "bread", "risotto" } };

		System.out.println(food.length);  // total # of rows or arrays
		int sizeof1Array = food[0].length;
		System.out.println(sizeof1Array);
		
		int sizeofArray = food[3].length;
		System.out.println(sizeofArray);
		
	//	System.out.println(food[2][1]);
	//	food[3][2] = "cheese";
	//	System.out.println(food[3][2]);
		
		//printing entire 2d array
		for (int i=0; i<food.length; i++) { //iterates over rows/arrays
			System.out.println();
			for (int j=0; j<food[i].length; j++) {      // iterate over columns/each element from an array
				System.out.print(food[i][j] + " ");
			}
		}
	}

}
