package com.java.programs;

import java.util.Arrays;

/*
 Given an array and a number k where k is smaller than size of array, we need to find the k�th smallest element in the given array. It is given that ll array elements are distinct.

Examples:

Input: arr[] = {7, 10, 4, 3, 20, 15}
       k = 3
       Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}
       k = 4
       Output: 10
 */
public class kthSmallLargestElementArray {

	// element in a given array
	public static int kthSmallest(Integer[] arr, int k) {
		// Sort the given array
		Arrays.sort(arr);

		// Return k'th element in
		// the sorted array
		return arr[k - 1];
	}

	// driver program
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int k = 2;
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));
	}
}
