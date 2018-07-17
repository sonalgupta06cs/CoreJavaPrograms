package com.java.collection;

class Emp{
	
	int id;
	String name;
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}

public class EqualsMethodAndOperator {

	public static void main(String[] args) {
		
		Emp emp1 = new Emp(1, "Sonal");
		Emp emp2 = new Emp(1, "Sonal");
		Emp emp3 = new Emp(2, "Sona");
		
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		
		emp1=emp2;
		
	    System.out.println(emp1==emp2);
	    System.out.println(emp1.equals(emp2));
		

	}

}
