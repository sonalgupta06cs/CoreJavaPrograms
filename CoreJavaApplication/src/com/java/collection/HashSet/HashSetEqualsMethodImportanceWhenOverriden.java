package com.java.collection.HashSet;

import java.util.HashSet;
import java.util.Set;

/*
 * So when adding a new element, object reference is being checked rather than content. Hence we have objects with duplicate content, however they are having different references. Let’s see what happens when we define hashCode() and equals() methods in the Emp class.
 * */
import java.util.HashSet;
import java.util.Set;

public class HashSetEqualsMethodImportanceWhenOverriden {

	public static void main(String[] args) {

		Set<Emp1> emp1s = new HashSet<>();
		emp1s.add(new Emp1(1, "Pankaj"));
		emp1s.add(new Emp1(2, "David"));
		emp1s.add(new Emp1(1, "Pankaj"));

		System.out.println(emp1s);

		Emp1 e = new Emp1(3, "Lisa");
		emp1s.add(e);
		System.out.println(emp1s);

		// set values to make it duplicate
		e.setId(1);
		System.out.println(emp1s);
		e.setName("Pankaj");
		System.out.println(emp1s);
	}

}

class Emp1 {
	private String name;
	private int id;

	public Emp1(int i, String n) {
		this.setId(i);
		this.setName(n);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Emp1))
			return false;
		Emp1 e = (Emp1) obj;
		if (e.getId() == this.getId() && this.getName().equals(e.getName()))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return getId();
	}

	@Override
	public String toString() {
		return "{" + getId() + "," + getName() + "}";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

}

/*
 * Notice that HashSet was able to check for duplicate when we tried to add an
 * element. But we can change the object values using setter methods and make it
 * duplicate. It worked because there is no operation done on Set. This is why
 * Immutable objects works better with Set and Map.
 */