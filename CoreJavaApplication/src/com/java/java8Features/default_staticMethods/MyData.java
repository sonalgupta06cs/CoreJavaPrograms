package com.java.java8Features.default_staticMethods;

public interface MyData {

	default void print(String str) {
		System.out.println("interface print()");
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}
	
	//void test();
	
	

	/*
	 * Java interface static method is similar to default method except that we
	 * can’t override them in the implementation classes. This feature helps us in
	 * avoiding undesired results incase of poor implementation in implementation
	 * classes
	 */
	default boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}