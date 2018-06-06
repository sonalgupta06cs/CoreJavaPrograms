package com.java.collection;

import java.util.HashMap;
import java.util.Map;

class Employe{
	
	int id;
    String name;
    
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class HashCodeAndEqualsMethodOverridden {

	public static void main(String[] args) {
		
		Employe employee1 = new Employe(1, "Sonal");
		Employe employee2 = new Employe(1, "Sonal");
		
		System.out.println("employee1 "+employee1 +" employee2 "+employee2);
		
		int emp1HashCode = employee1.hashCode();
		int emp2HashCode = employee2.hashCode();
		
		System.out.println("emp1HashCode "+emp1HashCode +", emp2HashCode "+emp2HashCode);
		
		Map<Employe, String> map = new HashMap<>();
		map.put(employee1, "One");
		map.put(employee2, "Two");
		
		System.out.println("emp map size "+map.size());  // returns size 1 once Employee overrides the equals & hashcode method
		
		// --------------------------------------------
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		int i1HashCode = i1.hashCode();
		int i2HashCode = i2.hashCode();
		
		System.out.println("i1HashCode "+i1HashCode +", i2HashCode "+i2HashCode);
				
		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(i1, "One");
		mapInt.put(i2, "Two");
		
		System.out.println("emp map size "+mapInt.size()); // returns size 1 as Integer class has already overridden the equals & hashcode method
		
	}

}
