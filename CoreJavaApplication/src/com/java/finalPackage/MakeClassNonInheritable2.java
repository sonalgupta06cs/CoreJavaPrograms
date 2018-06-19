package com.java.finalPackage;

class FinalClassTest{
	
	FinalClassTest finalClassTest;
    	
	private FinalClassTest() {
		System.out.println("FinalClassTest Private Constructor");
	}
	
	public static FinalClassTest getInstance() {
		FinalClassTest classTest = new FinalClassTest();
		System.out.println(classTest.toString());
		return classTest;
	}
}

// Uncomment to see the behaviour
/*public class MakeClassNonInheritable2 extends FinalClassTest{

	public static void main(String[] args) {
		
		// When it will instantiate MakeClassNonInheritable2 class using default constructor
		// COmplier will put super constructor call as first statement since super class
		// constructor is private so complier will throw the exception.
		MakeClassNonInheritable2 inheritable2 = new MakeClassNonInheritable2();
		FinalClassTest.getInstance();

	}
}*/

