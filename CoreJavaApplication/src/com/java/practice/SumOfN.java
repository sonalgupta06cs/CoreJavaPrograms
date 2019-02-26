package com.java.practice;

import java.util.Scanner;

/*
 * Instructions:

We have defined an integer variable N for you.
We have provided the code to get the input for variable N.
We have defined an integer array .
We have provided the code to get the input for the array elements.
You have to write the logic to add the array elements.
Print the sum.
Sample Input: 
N = 3 
Array = 6 3 8

Sample Output:
17
 * */
public class SumOfN {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		// Define an array of integers of size N.
		int[] numArray = new int[N];

		int sum = 0;
		for (int i = 0; i < N; i++) {
			numArray[i] = s.nextInt(); // Get the input
		}

		// Write the logic to add these numbers here:
		System.out.println("N" + N);
		for (int j = 0; j < numArray.length; j++) {
			sum += numArray[j];
		}

		// Print the sum
		System.out.print(sum);
		s.close();
	}

}