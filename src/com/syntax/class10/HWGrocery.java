package com.syntax.class10;

public class HWGrocery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String groceryList[][] = { { "carrots", "bell peppers", "tomatoes" }, { "apples", "pears", "melons" },
				{ "milk", "cheese", "yogurt" }, { "cookies", "waffles", "pies" } };
		
		for (String [] department:groceryList) {
			for (String item:department) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		for (int i=0;i<groceryList.length; i++) {
			for (int j=0; j<groceryList[i].length; j++) {
				System.out.print(groceryList[i][j] + " ");
			}
			System.out.println();
		}

	}

}
