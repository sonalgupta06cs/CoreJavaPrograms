package com.java.beginners;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to be reversed:- ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // 32/10 = 3
		int reversed = 0;
		while(number != 0) {
			int digits = number%10;   // 2 3
			reversed = reversed * 10 + digits; // 2
			number = number/10; // 3
		}
		
		System.out.println("The reversed number is "+ reversed);

	}

}
