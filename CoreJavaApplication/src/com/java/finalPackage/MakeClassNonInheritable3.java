package com.java.finalPackage;

// Making the method final
class FinalClassTes{
	
	private int id;
	private String name;
	
	public FinalClassTes() {
		System.out.println("FinalClassTest Private Constructor");
	}
	
	final void setPropertiesTest() {
		id = 1;
		name = "Sonal";
		System.out.println(id+" "+name+" final method");
	}
	
	private static FinalClassTes getInstance() {
		return new FinalClassTes();
	}
}


public class MakeClassNonInheritable3 extends FinalClassTes{

	// Uncomment to see the behaviour
	// you cant override the final methods
    /*void setPropertiesTest() 
    {
    	System.out.println("overridden method");
    }*/
    
	public static void main(String[] args) {
		
		MakeClassNonInheritable3 inheritable3 = new MakeClassNonInheritable3();
		inheritable3.setPropertiesTest();
	}
}

