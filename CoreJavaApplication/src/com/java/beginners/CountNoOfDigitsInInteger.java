package com.java.beginners;

import java.util.Scanner;

public class CountNoOfDigitsInInteger {

	public static void main(String[] args) {
		
		System.out.println("Enter a number for the digits to be counted:- ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // 29/10
		int count = 0;
		while(number != 0) {
			number = number/10;
			count++;
		}
		System.out.println("the number of digits are "+count);

	}

}
