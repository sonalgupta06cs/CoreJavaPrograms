package com.java.Array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachElementInArray {

	public static void main(String[] args) {

		int [] arr = new int[] { 1, 1, 1, 2, 2, 0 };
		
		Map<Integer,Integer> map = new HashMap<>();
		
                                               // K -> V
		for(int i = 0; i<arr.length ; i++) {   // 1 -> 3, 2-> 2, 0 -> 1
		
			if(map.containsKey(arr[i]))
			{
				// increment the value
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
			    map.put(arr[i], 1);
			}
		}
		
		System.out.println("Using foreach");	
		// ForEach Method in Java 8
		map.forEach((K,V) -> System.out.println(K+" "+V));
		
		// Maximum Repeated Integer
		int maxValueInCollection = Collections.max(map.values());
		
		int firstNonRCounter = 0;
		
		for(Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
			
			// First Non-Repetitive Element
			if(entrySet.getValue()== 1 && (firstNonRCounter == 0)) {
				System.out.println("First Non-Repetitive Element "+entrySet.getKey());
				firstNonRCounter++;
			}
			
			// Top-Most Repetitive Element
			if(entrySet.getValue() == maxValueInCollection) {
				System.out.println("Maximum Repeated Element is "+entrySet.getKey()+" i.e. "+entrySet.getValue()+" times");
			}
		}
	}

}
