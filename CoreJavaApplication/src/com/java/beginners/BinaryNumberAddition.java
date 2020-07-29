package com.java.beginners;

import java.util.Scanner;

public class BinaryNumberAddition {

	public static void main(String[] args) {
		
		long b1, b2 = 0;
		int carry = 0, i = 0;
		int[] sum = new int[10];
		
		//To read the input binary numbers entered by user
		Scanner scanner = new Scanner(System.in);

		//getting first binary number from user
		System.out.print("Enter first binary number: ");
		b1 = scanner.nextLong();                                //       1 1 1 0 0
		//getting second binary number from user
		System.out.print("Enter second binary number: ");
		b2 = scanner.nextLong();                                //       1 0 1 0 1

		//closing scanner after use to avoid memory leak
		scanner.close();

		while(b1 != 0 || b2 != 0) {
			
			sum[i]
			
			b1 = ;
			b2 = ;
		}
	}

}
