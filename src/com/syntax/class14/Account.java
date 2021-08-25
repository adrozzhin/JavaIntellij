package com.syntax.class14;

public class Account {
	
	void areCredentialsMeetReq (String userName, String password, String confirmPassword) {
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else if (password.length()<8) {
			System.out.println("Password is too short");
		} else if (password.contains(userName)) {
			System.out.println("Password cannot contain username");
		} else if (!(confirmPassword.equals(password))) {
			System.out.println("Passwords do not match");
		} else {
			System.out.println("Your username and password has been created");
		}
	}

}
