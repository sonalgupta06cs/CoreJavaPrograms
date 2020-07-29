package com.java.beginners;

import java.util.Scanner;

public class PowerOfNo {

	public static void main(String[] args) {
		
		System.out.println("Enter a base whose power is to be calculated:-");
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		System.out.println("Enter a exponent");
		int exponents = scanner.nextInt();
		int results = powCustomCalculationLogic(base, exponents);		
		System.out.println("The pow "+ exponents  +" of number "+ base + " is: "+results);
		results = powInBuiltMethod(base, exponents);		
		System.out.println("The pow "+ exponents  +" of number "+ base + " is: "+results);		
 
	}

	private static int powInBuiltMethod(int base, int exponent) {
		
		double results = Math.pow(base, exponent);
		return new Integer((int) results);
	}

	private static int powCustomCalculationLogic(int base, int exponents) {
		int results = 1, counter = 0;
		
		while(counter < exponents) {
			
			results *= base; // 8
			counter++;
		}
		return results;
	}

}
