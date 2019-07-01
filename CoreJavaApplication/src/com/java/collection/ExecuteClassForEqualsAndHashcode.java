package com.java.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExecuteClassForEqualsAndHashcode {

	public static void main(String[] args) {

		StudentOverrideEqualsAndHashCode s1 = new StudentOverrideEqualsAndHashCode("1174");
		StudentOverrideEqualsAndHashCode s2 = new StudentOverrideEqualsAndHashCode("1174");

		System.out.println("check " + s1.equals(s2)); 
		// it calls the equals() method of Object class
		System.out.println(s1 == s2);

		Map<StudentOverrideEqualsAndHashCode, ReportCard> studentsReport = new HashMap<>();
		studentsReport.put(s1, new ReportCard());
		studentsReport.put(s2, new ReportCard());

		// There should be only 1 report card, these 2 objects represents 1 same single
		// student.

		System.out.println(studentsReport.size());
		// we get 2 objects which is wrong without overriding the equals & hashcode
		// method coz
		// equals method says these are 2 differnet objects but there should be 1

		// Checking the performance of Collections when implemented hashCode() since it
		// works based on
		// buckets for retrieval of the objects which will be so fast
		Set<StudentOverrideEqualsAndHashCode> studentSet = new HashSet<StudentOverrideEqualsAndHashCode>();
		for (int i = 0; i < 100; i++) {
			studentSet.add(new StudentOverrideEqualsAndHashCode("H" + i));
		}

		long startTime = System.nanoTime();
		System.out.println("test " + studentSet.contains(new StudentOverrideEqualsAndHashCode("H4")));
		System.out.println("Elapsed Time " + (System.nanoTime() - startTime)); // retrieval is so fast
		// uncomment hashcode() to see the more elapsed time

		StudentOverrideEqualsAndHashCode s3 = new StudentOverrideEqualsAndHashCode("1174");

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s2) + "--" + s2.equals(s1));
		System.out.println(s1.equals(s2) + "--" + s2.equals(s3) + "--" + s3.equals(s1));
		System.out.println(s1.equals(null));

	}

}
