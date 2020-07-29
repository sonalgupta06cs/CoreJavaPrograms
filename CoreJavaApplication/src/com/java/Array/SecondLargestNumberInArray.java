package com.java.Array;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		
		findSecondLargestNumber(arr);

	}

	private static void findSecondLargestNumber(int[] arr) {
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
				
			} else if(arr[i] > secondLargest) {
				
				secondLargest = arr[i];
				
			}

		}
		
		System.out.println("\nLargest number is: " + largest);
		
		System.out.println("Second largest number is: " + secondLargest);
	}

}
