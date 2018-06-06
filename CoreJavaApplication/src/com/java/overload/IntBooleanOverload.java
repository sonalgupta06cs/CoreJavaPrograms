package com.java.overload;

public class IntBooleanOverload {

	public static void main(String[] args) {
		//method();  // uncomment this method
	}
	
	public static void method(int ... i) {
		System.out.println("int");
		for(int n : i) {
			System.out.println(i);
		}
	}
	
	public static void method(boolean ... b) {
		System.out.println("boolean");
		for(boolean n : b) {
			System.out.println(n);
		}
	}

}

//This will result in a compilation problem because the call method() is ambiguous..
//compiler won’t be able to resolve which of the overloaded methods to invoke.
