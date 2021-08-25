package com.syntax.class13;

public class Methods {
	
	void RepeatWords (int times, String Words) {
		for (int i=0; i<times; i++) {
			System.out.println(Words);
			
		}
	}
	
	void isItRaining (boolean isRain) {
		if(isRain) {
			System.out.println("Please take an umbrella");
		} else {
			System.out.println("Lets go for a walk");
		}
	}
	int add(int number1,int number2) {
		return number1+number2;
		
	}
}
