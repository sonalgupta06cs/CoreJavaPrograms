/**
 * 
 */
package com.java.collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author SonaSach
 *
 */
public class MapSortByKeyFieldString {

	/**
	 * HashMap does not maintain any order neither based on key nor on basis of
	 * value, If we want the keys to be maintained in a sorted order, we need to use
	 * TreeMap. 
	 * 
	 * Complexity: using HashMap get/put/containsKey() operations are O(n) in average
	 * case but we can’t guarantee that since it all depends on how much time does
	 * it take to compute the hash.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("z", 10);
		unsortedMap.put("b", 5);
		unsortedMap.put("a", 6);
		unsortedMap.put("c", 20);
		unsortedMap.put("d", 1);
		unsortedMap.put("e", 7);
		unsortedMap.put("y", 8);

		System.out.println("Unsort Map......");
		printMap(unsortedMap);

		System.out.println("\nSorted Map......By Key");
		// TreeMap sorts in the ascending order of its keys.
		Map<String, Integer> sortedMap = new TreeMap<>(unsortedMap);
		printMap(sortedMap);

	}

	private static <K, V> void printMap(Map<K, V> unsortMap) {

		for (Entry<K, V> entryMap : unsortMap.entrySet()) {

			System.out.println("Key " + entryMap.getKey() + " " + "Value " + entryMap.getValue());

		}

	}

}
