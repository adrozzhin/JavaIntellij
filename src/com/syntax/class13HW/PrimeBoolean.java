package com.syntax.class13HW;

public class PrimeBoolean {

	boolean isPrime(int number) {
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}

		} else {
			return false;
		}
		return true;

	}

}
