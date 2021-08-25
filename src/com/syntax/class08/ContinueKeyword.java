package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<3; i++) {
			
			if (i==1) {
				continue;
			}
			System.out.println("I am inside the loop");
	
			System.out.println(i);
			
			for (int j=1; j<=10; j++) {
				if (j==5) {
					continue;
				}
				System.out.println(j+" ");
			}
		}
	}
}
