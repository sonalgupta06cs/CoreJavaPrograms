package com.java.collection.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee> {

	int age;
	String name;

	public Employee(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getAge() > o2.getAge())
			return 1;
		if (o1.getAge() < o2.getAge())
			return -1;
		else
			return 0;
		
		if(o1.getName().compareTo(anotherString))
	}

}

public class EmployeeComparator {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Dell", 1000));
		empList.add(new Employee("HP", 80));
		empList.add(new Employee("Apple", 1600));
		empList.add(new Employee("Acer", 600));

		Collections.sort(empList);

		for (Employee emp : empList) {

			System.out.println(emp);

		}
	}
}
