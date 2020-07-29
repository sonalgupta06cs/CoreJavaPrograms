package com.java.collection.Map;

import java.util.HashMap;
import java.util.Map;

class Student{
	
	int emp_id;
	String name;
	double salary;
	
	public Student(int emp_id, String name, double salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return 5;
	}
	
	/*
	 * @Override public boolean equals(Object st) { return false; }
	 */
}

public class HashMapSizeTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Sonal", 12000);
		Student s2 = new Student(1, "Sonal", 12000);
		Student s3 = new Student(1, "Sonal", 12000);
		
		Map<Student, String> hashObj = new HashMap<>();
		hashObj.put(s1,"One");
		hashObj.put(s2,"Two");
		hashObj.put(s3,"Three");
		
		System.out.println(hashObj.size());
		
	}

}
