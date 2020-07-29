package com.java.Array;

// Java program to find index of 
// an element in N elements 
import java.util.Arrays;

public class index {

	// Function to find the index of an element
	public static int findIndex(int arr[], int t) {

		int index = Arrays.binarySearch(arr, t);
		return (index < 0) ? -1 : index;
	}

	// Driver Code
	public static void main(String[] args) {
		int[] my_array = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85, 85, 47, 47 };

		Arrays.sort(my_array);

		for (int i = 0; i < my_array.length; i++) {
			System.out.print(my_array[i] + "\t");
		}

		System.out.println();

		// find the index of 5
		System.out.println("Index position of 5 is: " + findIndex(my_array, 52));

		// find the index of 7
		System.out.println("Index position of 7 is: " + findIndex(my_array, 14));
	}
}