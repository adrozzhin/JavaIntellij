package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if is a a condition (true false) based statement
		// if is like a ladder
		
		int day = 3;
		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("today is Wednesday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Wromg inpput");
		}
		
		System.out.println("-------Switch method--------");
		
		//switch is a value based statement. if find matching value case and jumps right away
		//switch is like an elevator
		
		/*
		 * in switch always remember
		 * 
		 * Always use break; --> to stop 
		 */
		
		String dayName;
		
		switch (day) {
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
		default:
			dayName="Invalid";
		}
		
		System.out.println("Today is " + dayName);

	}

}
