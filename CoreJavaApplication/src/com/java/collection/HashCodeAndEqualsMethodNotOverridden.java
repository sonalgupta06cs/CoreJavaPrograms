package com.java.collection;

import java.util.HashMap;
import java.util.Map;

class Employee{
	
	int id;
    String name;
    
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class HashCodeAndEqualsMethodNotOverridden {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, "Sonal");
		Employee employee2 = new Employee(1, "Sonal");
		
		System.out.println("employee1 "+employee1 +" employee2 "+employee2);
		
		int emp1HashCode = employee1.hashCode();
		int emp2HashCode = employee2.hashCode();
		
		System.out.println("emp1HashCode "+emp1HashCode +", emp2HashCode "+emp2HashCode);
		
		
		Map<Employee, String> map = new HashMap<>();
		map.put(employee1, "One");
		map.put(employee2, "Two");
		
		System.out.println("emp map size "+map.size());  // returns size 2 as Employee has not overridden the equals & hashcode method
		
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
