package com.java.exceptionHandling;

public class CheckTryReturn {

	public static void main(String[] args) {
	    System.out.println(CheckTryReturn.test());
	}

	public static int test() {
	    try {
	        return 0;
	    }
	    finally {
	        System.out.println("finally trumps return.");
	    }
	}
}
