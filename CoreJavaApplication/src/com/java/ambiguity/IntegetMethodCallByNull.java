package com.java.ambiguity;
public class IntegetMethodCallByNull {

	public void foo(Object s) {
		System.out.println("Object");
	}
	
	public void foo(String s) {
		System.out.println("String");
	}

	public void foo(Integer s) {
		System.out.println("Integer");
	}
	public static void main(String[] args) {
		//new IntegetMethodCallByNull().foo(null); // Uncomment to see the ambigous nature
	}
	
	//You will get compile time error as The method foo(Object) is 
	//ambiguous for the type IntegetMethodCallByNull because both String and Integer 
	//class have Object as parent class and there is no inheritance.
	//So java compiler doesn’t consider any of them to be more 
	//specific, hence the method ambiguous call error.

}