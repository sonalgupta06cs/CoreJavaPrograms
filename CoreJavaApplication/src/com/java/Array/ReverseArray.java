package com.java.Array;

/*
 * 
 * Print the reverse of an array
 * */
public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,5,6,4,8};
		
		System.out.println("Array Length "+arr.length);
		
		for(int i=arr.length-1 ; i>=0; i--) {
			
			System.out.println(arr[i]);
		}

	}

}
