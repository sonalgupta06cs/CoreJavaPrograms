package com.java.beginners;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:-");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); 
		int reversedInteger = 0, originalInteger;
		originalInteger = number;

		while(number != 0) {
			int digit = number % 10; // 1 2 1
			reversedInteger = reversedInteger * 10 + digit; // 121
			number = number / 10;
		}
        
		if(originalInteger == reversedInteger) {
			System.out.println(originalInteger+" is palindrome");
		} else {
			System.out.println(originalInteger+" is not palindrome");
		}
	}

}
