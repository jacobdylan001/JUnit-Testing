package com.promineotech;

import java.util.Random;

public class TestDemo {

	// Add positive method checks to see if two numbers are greater than 0, if so, they are added together.
	
	public int addPositive(int a, int b) {
		int sum = a + b;
		if (a >= 0 && b >= 0) {
			return sum;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	// Divide positive method checks to see if two numbers are greater than 0, if so, they are divided.
	
	public int dividePositive(int a, int b) {
		int quotient = a / b;
		if (a >= 0 && b >= 0) {
			return quotient;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}

	// Random number squared method gets a random number and squares them.
	
	public int randomNumberSquared() {
		
		int randomNumber = getRandomInt();
		return randomNumber * randomNumber;
	}
	
	// Get random method creates a new instance of a random and returns it.
	
	int getRandomInt() {
		
	    Random random = new Random();
	    return random.nextInt(10) + 1;
	}




}
