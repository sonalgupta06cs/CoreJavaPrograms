/**
 * 
 */
package com.java.java8Features.functionalInterface;

/**
 * @author SonaSach
 *
 */

@FunctionalInterface
public interface FuncInterface3 {
	
	void display(); // 1st abstract method
		
	static void show() { // static method
		
		System.out.println("I3 show::");
		
	}
	default void visible() { // default method
		
		System.out.println("I3 visible::");
		
	}

}
