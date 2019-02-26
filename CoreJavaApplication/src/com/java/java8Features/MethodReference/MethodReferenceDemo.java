/**
 * 
 */
package com.java.java8Features.MethodReference;

import java.util.Arrays;
import java.util.List;

/**
 * @author SonaSach
 *
 */
public class MethodReferenceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> listStrings = Arrays.asList("Sonal", "Sachin");
		listStrings.forEach(str -> System.out.println(str));

		// or
		// This is Call by Method, where in we are passing a function to a function as
		// an argument
		listStrings.forEach(System.out::println);

	}

}
