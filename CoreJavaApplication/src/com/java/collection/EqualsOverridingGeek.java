package com.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 *             Case 2 : Overriding only the equals(Object) method
 * If we only override equals(Object) method, when we call map.put(g1, “CSE”);
 * it will hash to some bucket location and when we call map.put(g2, “IT”); it
 * will hash to some other bucket location because of different hashcode value
 * as hashCode() method has not been overridden.
 * 
 * both values will be getting stored into different bucket locations. Like that
 * every insert into map will get different bucket location whether we are using
 * same key objects or different i.e. state of key objects is same or different.
 * 
 * @author SonaSach
 *
 */
class Geek1 {
	String name;
	int id;

	Geek1(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// if both the object references are
		// referring to the same object.
		if (this == obj)
			return true;

		// it checks if the argument is of the
		// type Geek by comparing the classes
		// of the passed argument and this object.
		// if(!(obj instanceof Geek)) return false; ---> avoid.
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		// type casting of the argument.
		Geek1 geek = (Geek1) obj;

		// comparing the state of argument with
		// the state of 'this' Object.
		return (geek.name.equals(this.name) && geek.id == this.id);
	}
}

public class EqualsOverridingGeek {
	public static void main(String[] args) {

		// creating two Objects with
		// same state
		Geek1 g1 = new Geek1("aditya", 1);
		Geek1 g2 = new Geek1("aditya", 1);
		
		

		Map<Geek1, String> map = new HashMap<Geek1, String>();
		map.put(g1, "CSE");
		map.put(g2, "IT");

		System.out.println(g1.equals(g2)+" "+map.size());
		
		for (Geek1 geek : map.keySet()) {
			System.out.println(map.get(geek).toString());
		}

	}
}
