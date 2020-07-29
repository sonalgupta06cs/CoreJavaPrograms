package com.java.beginners;

public class PrimeNumberBetweenIntervals {

	public static void main(String[] args) {
	    
		int from = 20, to = 50;
		
		while(from < to) {
			if(checkPrime(from)) {
				System.out.print(from+" ");
			}	
			++from;
		}

	}

	private static boolean checkPrime(int from) {
		
		boolean isPrime = true;
		for(int i = 2; i < from/2 ; i++) {
			// condition for non-prime
			if(from % i == 0) {
				isPrime = false;
				break;				
			}
		}
		
		return isPrime;
	}

}
