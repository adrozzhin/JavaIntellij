package com.syntax.class13;

public class GreetingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greetings Greeting = new Greetings();
		System.out.println("Line before");
		Greeting.sayHello();
		System.out.println("Line after");
		Greeting.printNumber(5);
		Greeting.printNumber(50);
		Greeting.printNumber(500);
		Greeting.sayHelloManyTimes(5);
		
		

	}

}
