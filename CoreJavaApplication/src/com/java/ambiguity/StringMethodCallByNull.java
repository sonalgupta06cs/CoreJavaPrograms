package com.java.ambiguity;
public class StringMethodCallByNull {

	public void foo(Object o) {
		System.out.println("Object");
	}

	public void foo(String s) {
		System.out.println("String");
	}
	public static void main(String[] args) {
		new StringMethodCallByNull().foo(null);
	}
	
	// above program compiles perfectly and when we run it, it prints “String”.
    // So the method foo(String s) was called by the program.
	// The reason behind this is java compiler tries to find out the method 
	// with most specific input parameters to invoke a method. We know that
	// Object is the parent class of String, so the choice was easy.

}