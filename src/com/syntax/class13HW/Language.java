package com.syntax.class13HW;

public class Language {

	void checkLanguage(String country) {

		String greeting;

		switch (country) {
		case "English":
			greeting = "Hello!";
			break;
		case "Mandarin":
			greeting = "Ni Hao!";
			break;
		case "Russian":
			greeting = "Privet!";
			break;
		case "French":
			greeting = "Bonjour!";
			break;
		case "Spanish":
			greeting = "Hola!";
			break;
		default:
			greeting = "Unknown language";
		}
		System.out.println(greeting);
	}

}
