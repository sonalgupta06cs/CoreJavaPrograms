package com.java.exceptionHandling;

import java.io.IOException;

public class JavaCheckedExceptionExample {
	
	public void doEvenMore() throws IOException {
		doMore();
	}

	public void doMore() throws IOException {
		doSomething();
	}

	public void doSomething() throws IOException {
		System.out.println("doSomething");// do something
		throw new IOException();
	}
	
	public static void main(String args[]) {
		try {
			new JavaCheckedExceptionExample().doEvenMore();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
}