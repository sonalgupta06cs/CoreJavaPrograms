package com.java.java8Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodExam {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(5, 7, 9, 10);

		/*
		 * for(int i = 0; i<intList.size() ; i++) { System.out.println(intList.get(i));
		 * }
		 */

		// for each loop
		/*
		 * for(int num : intList) { System.out.println(num); }
		 */

		// All above loops are external loops which means these are not a part of
		// collections framework

		// forEach method i.e. internal loop which is part of collections framework
		intList.forEach(i -> System.out.println(i));
		// forEach method takes a parameter which is an object of Consumer Interface
		// Hence, whatever is written inside forEach is implementation of Consumer
		// interface.

	}

}
