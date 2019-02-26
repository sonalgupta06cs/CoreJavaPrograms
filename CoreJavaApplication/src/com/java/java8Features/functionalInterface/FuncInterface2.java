/**
 * 
 */
package com.java.java8Features.functionalInterface;

/**
 * @author SonaSach
 *
 */

@FunctionalInterface
public interface FuncInterface2 {

	void display(); // 1st abstract method

	static void show() { // static method
		System.out.println("I2 show:: ");
	}

	default void visible() { // default method

		System.out.println("I2 visible::");

	}

	default void showFunc2() { // default method

		System.out.println("I2 showFunc2::");

	}
	
	default void checkCall() {
		System.out.println("non-conflicting checkCall interface method call");
	}

}
