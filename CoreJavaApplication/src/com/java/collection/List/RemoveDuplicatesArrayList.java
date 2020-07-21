package com.java.collection.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Use HashSet()/LinkedHashSet()
 * 
 * @author SonaSach
 *
 */
public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Sonal");
		list.add("Sonal");
		list.add("Sachin");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Remove duplicates using Hashet and LinkedHashSet
		//removeDuplicatesUsingHashSetAndLinkedHashSet(list);
		// Remove duplicates using new ArrayList
        ArrayList<String> newList = removeDuplicates(list);
        System.out.println("newList "+newList);

	}

	private static <T> ArrayList<T> removeDuplicates(List<T> list) {

		ArrayList<T> listNew = new ArrayList<>();

		for (T element : list) {
			// If this element is not present in newList
			// then add it
			if (!listNew.contains(element)) {
				listNew.add(element);
			}
		}

		return listNew;

	}

	private static void removeDuplicatesUsingHashSetAndLinkedHashSet(List<String> list) {

		HashSet<String> set = new LinkedHashSet<>(list);
		System.out.println(set);

		// or

		HashSet<String> setDiff = new LinkedHashSet<>();

		// Add the elements to set
		setDiff.addAll(list);
		// Clear the list
		list.clear();
		// add the elements of set with no duplicates to the list
		list.addAll(setDiff);

		System.out.println(list);

	}

}
