package com.java.collection;

/**
 *                Case 1: Overriding both equals(Object) and hashCode() method
 *                
* Whenever it(hashcode) is invoked on the same object more than once during an execution of a Java 
* application, the hashCode method must consistently return the same integer, provided no information 
* used in equals comparisons on the object is modified. This integer need not remain consistent 
* from one execution of an application to another execution of the same application.

* If two objects are equal according to the equals(Object) method,
* then calling the hashCode method on each of the two objects must produce the same integer result.

* It is not required that if two objects are unequal according to the equals
*(java.lang.Object) method, then calling the hashCode method on each of the two objects must produce distinct integer
* results. However, the programmer should be aware that producing distinct integer results for unequal objects may improve 
* the performance of hashtables.
 */
import java.io.*;
import java.util.*;

class Geek {

	String name;
	int id;

	Geek(String name, int id) {

		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {

		System.out.println("equals called");
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
		Geek geek = (Geek) obj;

		// comparing the state of argument with
		// the state of 'this' Object.
		return (geek.name.equals(this.name) && geek.id == this.id);
	}

	@Override
	public int hashCode() {
		System.out.println("hashCodde called");
		// We are returning the Geek_id
		// as a hashcode value.
		// we can also return some
		// other calculated value or may
		// be memory address of the
		// Object on which it is invoked.
		// it depends on how you implement
		// hashCode() method.
		return this.id;
	}

}

// Driver code 
class EqualsAndHashCodeOverriding {
	public static void main(String[] args) {

		// creating two Objects with
		// same state
		Geek g1 = new Geek("aditya", 1);
		Geek g2 = new Geek("aditya", 1);

		Map<Geek, String> map = new HashMap<Geek, String>();
		map.put(g1, "CSE");
		map.put(g2, "IT");
		
		System.out.println(g1.equals(g2)+" "+map.size());

		for (Geek geek : map.keySet()) {
			System.out.println(map.get(geek).toString());
		}

	}
}