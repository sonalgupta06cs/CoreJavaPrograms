package com.java.immutable;

final class Employee {

	private final String name;
	private final Department dept;

	public Employee(String name, Department dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public Department getDept() {
		return dept;
	}
}

class Department {
	
	private final String name = null;
	private final String dep_id = null;
	public String getName() {
		return name;
	}
	public String getDep_id() {
		return dep_id;
	}
}

public class Test{
	
	public static void main(String[] args) {
		
		Department department = new Department();
		Employee employee = new Employee("Sonal",department);
		System.out.println(employee);
		// if u r setting the dep_id n name, so breaking the immutability, so for that
		// make name & dept_id as final in "Department" class, then immutability will be achieved.
		//department.setDep_id("dd");
		//department.setName("it");
		
	}
		
}
