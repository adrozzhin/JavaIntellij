package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String names[][] = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" } };
		//enhanced for each loop
		for (String[] arr:names) {
			for (String a:arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		System.out.println("---------");
			//how to access all elements
			
		for (int r=0; r<names.length; r++) { //outer loop iterates over rows
			for (int j=0;j<names[r].length;j++) { // inner loop iterates over columns
				
				System.out.print(names[r] [j] + " ");
			}
			System.out.println();
			
			
		}
	}

}
