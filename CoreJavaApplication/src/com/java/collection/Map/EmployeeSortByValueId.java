/**
 * 
 */
package com.java.collection.Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author SonaSach
 *
 */
public class EmployeeSortByValueId {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Employee2> map = new HashMap<>();

		map.put("e1", new Employee2(1, "Sonal", 45));
		map.put("e2", new Employee2(2, "Sachin", 6));
		map.put("e3", new Employee2(3, "Sach", 78));

		// Print unsorted map based on age
		printMap(map);

		// sort the Employee2s based on their age
		Map<String, Employee2> sortedmap = sortEmployee2s(map);

		// Print sorted map based on age
		printMap(sortedmap);
	}

	private static Map<String, Employee2> sortEmployee2s(Map<String, Employee2> unsortedmap) {

		// a.) convert map to a List of map
		List<Map.Entry<String, Employee2>> entryList = new LinkedList<>(unsortedmap.entrySet());

		// b.) Sort list with Collections.sort(), write a custom comparator
		Collections.sort(entryList, new Comparator<Map.Entry<String, Employee2>>() {

			@Override
			public int compare(Map.Entry<String, Employee2> o1, Map.Entry<String, Employee2> o2) {

				return (o1.getValue().getAge() > o2.getValue().getAge()) ? 1
						: (o1.getValue().getAge() < o2.getValue().getAge()) ? -1 : 0;
				// return o1.getValue().getAge().compareTo(o2.getValue().getAge());
			}
		});

		//// c.) Loop the sorted list and put it into a new insertion order Map LinkedHashMap
		Map<String, Employee2> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Employee2> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

	/**
	 * Method to print the key and values
	 * 
	 * @param map
	 */
	private static void printMap(Map<String, Employee2> map) {

		for (Map.Entry<String, Employee2> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey() + " - " + entrySet.getValue());
		}

	}

}

class Employee2 {

	private int id;
	private String name;
	private int age;

	public Employee2(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
