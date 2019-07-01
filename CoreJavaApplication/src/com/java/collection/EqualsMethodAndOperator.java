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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
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

public class EqualsMethodAndOperator {

	public static void main(String[] args) {
		
		Emp emp1 = new Emp(1, "Sonal");
		Emp emp2 = new Emp(1, "Sonal");
		Emp emp3 = new Emp(2, "Sona");
		
		System.out.println(emp1==emp2);              // false
		System.out.println(emp1.equals(emp2));       
		// false  // which gives a wrong
		// output since the id and name are equal but we have not overridden the equals() method.
		
		// but as soon as you overiide the equals() method, it gives the right answer.
		
		System.out.println(emp1.equals(emp3));       // false
		
		emp1=emp2;
		
	    System.out.println(emp1==emp2);              // true
	    System.out.println(emp1.equals(emp2));       // true
		

	}

}
