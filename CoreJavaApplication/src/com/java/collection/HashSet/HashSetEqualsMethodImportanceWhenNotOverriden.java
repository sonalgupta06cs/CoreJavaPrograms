package com.java.collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEqualsMethodImportanceWhenNotOverriden {

	public static void main(String[] args) {

		Set<Emp> emps = new HashSet<>();
		emps.add(new Emp(1, "Pankaj"));
		emps.add(new Emp(2, "David"));
		emps.add(new Emp(1, "Pankaj"));

		System.out.println(emps);
	}

}

class Emp {
	private String name;
	private int id;

	public Emp(int i, String n) {
		this.id = i;
		this.name = n;
	}

	@Override
	public String toString(){
		return "{"+id+","+name+"}";
	}
}

/*
 * So it looks like we were able to store duplicate elements in the Set.
 * Actually not, it’s happening because Emp class doesn’t define equals()
 * method, so Object class equals() method implementation is used. Object class
 * defines equals() method like below.
 */