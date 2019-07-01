package com.java.hackerrank.thirtydayschallenge;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int secInt;
		double secDob;
		String secStr;
		// Declare the object and initialize with
		// predefined standard input object

		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

		secInt = scan.nextInt();
		secDob = scan.nextDouble();
		scan.nextLine();
		secStr = scan.nextLine();

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + secInt);

		/* Print the sum of the double variables on a new line. */
		System.out.println(d + secDob);

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println(s + secStr);
	}
}