package com.syntax.class14;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new Account();
		acc1.areCredentialsMeetReq("", "", "");
		acc1.areCredentialsMeetReq("John", "Bmw", "Bmw");
		acc1.areCredentialsMeetReq("Andrei123", "ghgAndrei123drfgf", "ghgAndrei123drfgf");
		acc1.areCredentialsMeetReq("Andrei123", "Bmwcar123", "111Bmwcar123");
		acc1.areCredentialsMeetReq("Andrei123", "Bmwcar123", "Bmwcar123");
		

	}

}
