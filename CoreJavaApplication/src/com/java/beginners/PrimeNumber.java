package com.java.beginners;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	    
		System.out.println("Enter a number to be checked:-");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
	    checkIfPrime(number);

	}

	private static void checkIfPrime(int number) {
		
		boolean flag = false;
		for(int i = 2; i < number ; i++) {
			// condition for non-prime
			if(number % i == 0) {
				flag = true;
				break;				
			}
		}
		if(!flag) {
			System.out.println(number +" is a prime number");
		} else {
			System.out.println(number +" is not a prime number");
		}
	}

}
