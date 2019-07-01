package com.java.collection.Map;
/* Java program to print frequencies of all elements using 
HashMap */
import java.util.*;
import java.util.Map.Entry; 

class CountOccurenceOfEachIntInArr 
{ 
	// This function prints frequencies of all elements 
	static void printFreq(int arr[]) 
	{ 
		// Creates an empty HashMap 
		HashMap<Integer, Integer> hmap = 
					new HashMap<Integer, Integer>(); 

		// Traverse through the given array 
		for (int i = 0; i < arr.length; i++) 
		{ 
		
			// If elements already exists in hash map 
			if(hmap.containsKey(arr[i])) {
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}else { // If this is first occurrence of element 
				hmap.put(arr[i], 1);
			}
		} 
		
		for(Map.Entry<Integer, Integer> mapEntry : hmap.entrySet()) {
			//System.out.println("mapEntry "+mapEntry);
			System.out.println("Key "+mapEntry.getKey() +" , "+"Value "+mapEntry.getValue());	
		}
	} 

	// Driver method to test above method 
	public static void main (String[] args) 
	{ 
		int arr[] = {10, 34, 5, 10, 3, 5, 10}; 
		printFreq(arr); 
	} 
} 
