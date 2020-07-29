package com.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 *                 Case 3: Overriding only hashCode() method
 * Consider another example of map :
 * 
 * Map map = new HashMap(); map.put(“xyz”, “CSE”); map.put(“xyz”, “IT”); 
 * 
 * When we call map.put(“xyz”, “CSE”); it will generate hashcode value and stores it to
 * the bucket location that is specified with this address (hashcode value). And
 * when we call map.put(“xyz”, “IT”); it generates same hashcode value as
 * previous entry since key objects are same and hashCode() method has been
 * overridden. So it should replace first with second as per rule. But it
 * didn’t. Reason is, when it iterate through that bucket and seeks to find k
 * such that k.equals(“xyz”) i.e. if searching key already exist. But it fails
 * to find because equals(Object ) method has not been overridden. It is
 * violation of rule of hashing.
 * 
 * @author SonaSach
 *
 */
class Geek2 {

	String name;
	int id;

	Geek2(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
}

public class HashCodeOverriding {

	public static void main(String[] args) {

		Map<Geek2, String> map = new HashMap<>();

		Geek2 g1 = new Geek2("aditya", 1);
		Geek2 g2 = new Geek2("aditya", 1);

		map.put(g1, "CSE");
		map.put(g2, "IT");

		System.out.println(g1.equals(g2)+" "+map.size());

		for (Geek2 geek2 : map.keySet()) {
			System.out.println(map.get(geek2).toString());
		}

	}

}
