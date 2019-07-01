package com.java.eurofins.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author SonaSach
 *
 */
class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	
	public Employee(String firstName, String lastName, int age, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ "]";
	}	
}

public class SortByEmployeeFirstSecondNameUsingLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Rahul","Royy", 25, 50000));
		empList.add(new Employee("Rahul","Raj", 27, 50000));
		empList.add(new Employee("Anil","Sharma", 30, 50000));
		
		System.out.println("\nUnSorted Lambda"); 
		empList.forEach(i->System.out.println(i));
		
		Collections.sort(empList, 
			(o1, o2) ->
			{			
				int result = o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
				if(result != 0) {
					return result;
				}else {
				    return o1.getLastName().compareToIgnoreCase(o2.getLastName());
				}
			});
		
		System.out.println("\nSorted by name Lambda"); 
		empList.forEach(i->System.out.println(i));
		

	}

}
