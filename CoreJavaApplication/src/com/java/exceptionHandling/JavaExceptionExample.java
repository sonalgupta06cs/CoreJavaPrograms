package com.java.exceptionHandling;

public class JavaExceptionExample {
	
	public void doEvenMore() {
		doMore();
	}

	public void doMore() throws NumberFormatException, IllegalArgumentException {
		doSomething();
	}

	public void doSomething() throws NumberFormatException, IllegalArgumentException {
		System.out.println("doSomething");// do something
		throw new NumberFormatException();
	}
	
	public static void main(String args[]) {
		new JavaExceptionExample().doEvenMore();;
		
	}
}