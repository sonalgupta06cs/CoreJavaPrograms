package com.java.java8Features.forEachMethod;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodUsingLambda {

	public static void main(String[] args) {
		List<Integer> listValues = Arrays.asList(1, 11, 20, 77);

		listValues.forEach(i -> System.out.println(i));
		// forEach(i -> System.out.println(i));
	}
}
