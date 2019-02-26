package com.java.java8Features.default_staticMethods;

public class MyDataImpl implements MyData {
	
	//https://www.journaldev.com/2752/java-8-interface-changes-static-method-default-method

	/*
	 * Note that isNull(String str) is a simple class method, it’s not overriding
	 * the interface method. For example, if we will add @Override annotation to the
	 * isNull() method, it will result in compiler error.
	 */
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

	public static void main(String args[]) {
		MyDataImpl obj = new MyDataImpl();
		/*
		 * if you are calling through a method in interface, when you have a method in
		 * interface, it makes a call to that method
		 */
		obj.print(""); // it makes a call to static isNull() in interface else the one in class. 
		obj.isNull("abc"); // it makes a call to the method in class if the one in interface is static

		/* if isNull is static
		 * O/p:-
		 * interface print()
		 * Interface Null Check 
		 * Impl Null Check
		 * 
		 */
		
		/* if isNull is default 
		 * O/p:-
		    interface print()
			Impl Null Check
			MyData Print::
			Impl Null Check
		 * 
		 */
	}
}