package com.syntax.class13HW;

public class Email {
	
	//Create a method createEmail(). 
	//Based on values of users name, lastName and email type, your method should return complete email Address. 
	//Example:  createEmail(John, Snow, gmail) - johnsnow@gmail.com or 
	
	void emailCreator (String userName, String lastName, String emailType) {
		
		String wholeWord ="";
		wholeWord = wholeWord.concat(userName).concat(lastName).concat("@").concat(emailType);
		System.out.println(wholeWord);
		
	}

}
