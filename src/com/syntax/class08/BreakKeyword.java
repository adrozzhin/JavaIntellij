package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 6; i++) {

			System.out.println("today is Sunday");
			break;
		}
		boolean summer = true;
		int temp=75;
		
		while (summer) {
			System.out.println("summer");
			System.out.println(temp);
			if (temp>=95) {
				System.out.println("Too hot");
				//break;
			}
			temp+=2;
			
		}
	}

}
