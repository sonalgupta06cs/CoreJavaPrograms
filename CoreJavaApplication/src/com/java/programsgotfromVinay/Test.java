package com.java.programsgotfromVinay;

import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		int k = 3;

		Integer arr[] = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };

		// Sort the given array arr in reverse order
		// This method doesn't work with primitive data
		// types. So, instead of int, Integer type
		// array will be used
		Arrays.sort(arr, Collections.reverseOrder());

		// Print the first kth largest elements  
		for (int i = 0; i < k; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
