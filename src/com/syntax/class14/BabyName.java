package com.syntax.class14;

public class BabyName {
	
	String nameCreator(String momsName, String dadsName, String gender) {
	String babysName;
	
	if (gender.equalsIgnoreCase("boy")) {
		babysName = dadsName.substring(0, dadsName.length()/2).concat(momsName.substring(momsName.length()/2, momsName.length()));
	} else if (gender.equalsIgnoreCase("girl")) {
		babysName = momsName.substring(0, momsName.length()/2).concat(dadsName.substring(dadsName.length()/2, dadsName.length()));
	} else {
		babysName = "Wrong baby gender input";
	}
	
	return babysName;
	}

}
