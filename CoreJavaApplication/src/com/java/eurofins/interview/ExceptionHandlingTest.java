package com.java.eurofins.interview;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		
		String test = null;
		
		try {
			
			System.out.println(test.length());
			
		} catch (NullPointerException npe) {
			
			System.out.println("NPE Exception: "+npe);
		}

	}

}

// Compiles fine.Prints NPE Exception: and stack trace