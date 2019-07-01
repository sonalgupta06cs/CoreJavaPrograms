package com.java.programsgotfromVinay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CreateEmployeesListWithoutDuplicateEntries {

	public static void main(String[] args) {

		removeDuplicateEmployeeObjectFromList();

	}

	/**
	 * 
	 */
	private static void removeDuplicateEmployeeObjectFromList() {
		
		Employee hr = new Employee(1, "HR");
		Employee hrDuplicate = new Employee(1, "HR"); // Duplicate Object
		Employee teamLeader = new Employee(2, "Team Leader");
		
		List<Employee> list = new ArrayList<>();
		list.add(hr);
		list.add(hrDuplicate);
		list.add(teamLeader);
		
		System.out.println("Employee List(Duplicate)");
		for (Employee employee : list) {
			System.out.println(employee.getEmployeeName());
		}
		
		// Create HashSet. Set will contain only unique objects
		HashSet<Employee> hashSet = new HashSet<>(list); 
		System.out.println("Employee List(Unique)");
		for (Employee employee : hashSet) {
			System.out.println(employee.getEmployeeName());
		}
	}

}

// If you dont override equals() and hashCode(), it will still give deplicates in list.
class Employee {
	private int employeeId;
	private String employeeName;

	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
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
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}

    
}
