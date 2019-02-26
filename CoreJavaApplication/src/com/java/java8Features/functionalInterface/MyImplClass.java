package com.java.java8Features.functionalInterface;

public class MyImplClass implements FuncInterface2, FuncInterface3 {

	@Override
	public void display() {
		System.out.println("MyImplClass overridden method");

		// making a explicit call to interface default method.
		FuncInterface2.super.showFunc2();

	}

	// MyImplClass won't compile without having it's own visible() implementation
	@Override
	public void visible() {
		System.out.println("MyImplClass visible::");
		FuncInterface3.super.visible(); // explicit call to FuncInterface3 visible() method
		FuncInterface3.show(); // static method call of FuncInterface3
	}

	@Override
	public void showFunc2() {
		System.out.println("MyImplClass showFunc2::");
	}

	public static void main(String[] args) {
		MyImplClass implClass = new MyImplClass();
		implClass.visible();

		// FuncInterface2 interface2 = new MyImplClass();
		// interface2.showFunc2();
		// or
		implClass.showFunc2();

		// calling the overridden method of MyImplClass
		implClass.display();

		// Cannot make a static reference to the non-static method showFunc2() from the
		// type FuncInterface2, methods can't be called directly since they are not
		// static methods.
		// FuncInterface2.showFunc2();
		// 
		// Default methods from the interface can be overridden in case of conflict and 
		// called using instance of a class otherwise as well.
		implClass.checkCall();

	}
}
