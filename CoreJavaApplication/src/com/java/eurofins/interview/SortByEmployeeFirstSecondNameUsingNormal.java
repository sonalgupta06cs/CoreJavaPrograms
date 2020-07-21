package com.java.eurofins.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author SonaSach
 *
 */
class Employee1 {
	
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	
	public Employee1(String firstName, String lastName, int age, double salary) {
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
		return "Employee1 [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ "]";
	}	
}

class EmployeeComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		int result = o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
		if(result != 0) { // 1 or -1
			return result;
		}else { // when 0
		    return o1.getLastName().compareToIgnoreCase(o2.getLastName());
		}
	}
	
	
}
public class SortByEmployeeFirstSecondNameUsingNormal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee1> empList = new ArrayList<>();

		empList.add(new Employee1("Rahul","Royy", 25, 50000));
		empList.add(new Employee1("Rahul","Raj", 27, 50000));
		empList.add(new Employee1("Anil","Sharma", 30, 50000));
		
		System.out.println("\nUnSorted"); 
		empList.forEach(i->System.out.println(i));
		
		Collections.sort(empList, new EmployeeComparator());	
		
		System.out.println("\nSorted by name"); 
		empList.forEach(i->System.out.println(i));
		

	}

}
