package com.java.beginners;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		
		System.out.println("Enter the number whose factorial has to be calculated:-");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
//		long result = 1;
//		
//		while(number > 0) {
//			
//			result*=number;
//			number--;
//		}
		
		BigInteger factorial = BigInteger.ONE;
		
		while(number > 0) {
			factorial = factorial.multiply(BigInteger.valueOf(number));
			number--;
		}
		
		System.out.println(factorial);

	}

}
