package com.java.sabre;

import java.util.Scanner;


/**
 * Check whether if the given number is Happy or Not.
 * 
 * Take any positive integer, find the sum of the squares of its digits, repeat
 * this process until you get 1, or if the sum equals 4 (i.e repeats the cycle
 * again).
 * 
 * If the sum equals 1 (in the process) then the given number is "happy",
 * otherwise it is an "unhappy" number (or sad number).
 */
public class HappyNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("*** Happy Number ***\n");

		// Enter a number :
		int n = in.nextInt();

		boolean isHappy = isHappyNumber(n);

		if (isHappy) {
			System.out.println(n + " is a Happy number");
		} else {
			System.out.println(n + " is an Unhappy number");
		}
	}

	static boolean isHappyNumber(int number) {
		int sumOfSquares = number;
		do {
			sumOfSquares = sumOfSquareOfDigits(sumOfSquares);

			if (sumOfSquares == 1) {
				return true;
			}

		} while (sumOfSquares != 4);
		return false;
	}

	static int sumOfSquareOfDigits(int num) {
		if (num == 0)
			return 0;
		else {
			int temp = num % 10;
			return (temp * temp + sumOfSquareOfDigits(num / 10));
		}
	}
}
