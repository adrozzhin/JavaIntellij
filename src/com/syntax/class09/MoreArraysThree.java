package com.syntax.class09;

public class MoreArraysThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] grades = {'A', 'B', 'C','D', 'E', 'F'};
		
		int size=grades.length; //gives the size
		//System.out.println(size);
		
		
		
	//	System.out.println(grades[1]);
		
	////	int i=0;
	//System.out.println(grades[i]);
		
	//	i++;
	//	System.out.println(grades[i]);
		
		for (int j=0; j<size; j++) {
			System.out.print(grades[j]);
		}
		
		System.out.println("------------");
		
		String[] names = {"Olena", "Ayna", "Elena", "Eugene", "Andrei", "Serge", "Serge C", "Maria"};
		for(int k=0; k<names.length; k++) {
			System.out.print(names[k] + " ");
		}
				
	
	}

}
