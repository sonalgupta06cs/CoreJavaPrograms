package com.java.practice;

import java.util.Scanner;

/*
 * Instructions:

We have defined the integer variables L and R for you.
We have provided the code to get inputs for the variables.
Print all the integers between L and R (including L and R) with space between them
Sample Input: 
L = 5, R = 10

Sample Output: 
5 6 7 8 9 10
 * 
 * */
public class NumbersInRange {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Get L and R from the input
		int L = s.nextInt();
		int R = s.nextInt();

		// Write here the logic to print all integers between L and R

		for (int l = L; l <= R; l++) {
			System.out.print(l + " ");
		}

		s.close();
	}
}