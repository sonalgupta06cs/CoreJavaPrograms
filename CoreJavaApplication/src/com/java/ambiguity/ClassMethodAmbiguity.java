package com.java.ambiguity;

abstract class SuperClass{
	
	public abstract void doSomething();
	
}
class ClassA extends SuperClass{
	
	@Override
	public void doSomething(){
		System.out.println("doSomething implementation of A");
	}
	
	//ClassA own method
	public void methodA(){
			
	}
	
}

class ClassB extends SuperClass{
	
	@Override
	public void doSomething(){
		System.out.println("doSomething implementation of B");
	}
	
	//ClassB specific method
	public void methodB(){
		
	}
}

// uncomment to see the method ambiguity
/*class ClassC extends ClassB , ClassA
{
	
	public void methodC() {
		// Calling super class method
		  doSomething(); // method ambiguity which method to call
	}
}*/

public class ClassMethodAmbiguity {

}
