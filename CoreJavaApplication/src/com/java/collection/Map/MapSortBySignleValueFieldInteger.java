package com.java.collection.Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortBySignleValueFieldInteger {

	public static void main(String[] args) {

		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("z", 10);
		unsortedMap.put("b", 5);
		unsortedMap.put("a", 6);
		unsortedMap.put("c", 20);
		unsortedMap.put("d", 1);
		unsortedMap.put("e", 7);
		unsortedMap.put("y", 8);

		System.out.println("Unsorted Map:- ");
		printMap(unsortedMap);
		// Sorting the map based on integer value
		Map<String, Integer> sortedMap = sortUnsortedMap(unsortedMap);
		System.out.println("Sorted Map:- ");
		printMap(sortedMap);
	}

	/**
	 * 
	 * @param unsortedMap
	 * @return
	 */
	private static Map<String, Integer> sortUnsortedMap(Map<String, Integer> unsortedMap) {

		// a.) convert map to list of map
		List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortedMap.entrySet());

		// b.) Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

				// values will be swapped when 1st value will be greater than 2nd value
				return (o1.getValue() > o2.getValue()) ? 1 : (o1.getValue() < o2.getValue()) ? -1 : 0;
				// (o1.getValue()).compareTo(o2.getValue());

			}

		});
		
		System.out.println("list "+list);

		// c.) Loop the sorted list and put it into a new insertion order Map LinkedHashMap
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

	/**
	 * 
	 * @param unsortedMap
	 */
	private static <K,V> void printMap(Map<K, V> unsortedMap) {
		
		for(Map.Entry<K, V> entryMap : unsortedMap.entrySet()) {
			
			System.out.println("Key "+entryMap.getKey()+ " " +"Value "+entryMap.getValue());
			
		}
	}
}
