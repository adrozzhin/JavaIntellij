package com.syntax.reviewclass06;

public class Intelligence {
	
	void repeatationOfWords (int times, String word) {
		for (int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	
	void isThisBatchIntelligent (boolean isIntelligent) {
		if(isIntelligent) {
			System.out.println("Everyone is intell");
		} else {
			System.out.println("Wait");
		}
	}

}
