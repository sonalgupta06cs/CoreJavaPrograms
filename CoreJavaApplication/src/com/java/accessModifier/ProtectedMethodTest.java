package com.java.accessModifier;

//Class A 
class A 
{ 
    protected void display() 
	{ 
		System.out.println("GeeksforGeeks"); 
	} 
} 

//Class B is subclass of A 
class ProtectedMethodTest extends A {
	public static void main(String args[]) {
		ProtectedMethodTest obj = new ProtectedMethodTest();
		obj.display();
	}
}
