package com.java.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequencyWithIndexNumbers {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(14, 46, 47, 86, 92, 52, 48, 36, 66, 85, 85, 47, 47);

		Map<Integer, Integer> countIntMap = new HashMap<>();

		for (Integer i : intList) {
			if (countIntMap.containsKey(i)) {

				countIntMap.put(i, countIntMap.get(i) + 1);

			} else {
				countIntMap.put(i, 1);
			}
		}

		LinkedHashMap<Integer, Integer> lmp = new LinkedHashMap<>(countIntMap);
		System.out.println();

		Integer[] arr = (Integer[]) intList.toArray();
		//Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();

		for (Map.Entry<Integer, Integer> lhmmap : lmp.entrySet()) {
			System.out.println("\n"+lhmmap.getKey() + " " + lhmmap.getValue() + " " + findIndex(arr, lhmmap.getKey()) + "\t");
		}

	}
	
	public static int findIndex(Integer arr[], int t) 
    { 
  
		
		
        // if array is Null 
        if (arr == null) { 
            return -1; 
        } 
  
        // find length of array 
        int len = arr.length; 
        int i = 0, j = 0; 
        int counter = 0;
  
        // traverse in the array 
        while (i < len) {
           j = i+1;
            // if the i-th element is t 
            // then return the index 
            if (arr[i] == t) {
            	System.out.println(t+" "+i);
            	for(int k=)
				if(arr[j] == t) {
					System.out.print(t+ " index "+i+" "+j);
					i++;
				}
				else
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
            
            //counter = 0;
        } 
        return -1; 
    } 

	/*
	 * static int find_Index(Integer[] arr, int num) {
	 * 
	 * int index = Arrays.binarySearch(arr, num); return (index < 0) ? -1 : index; }
	 */

}
