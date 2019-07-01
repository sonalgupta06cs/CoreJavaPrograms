package com.java.exceptionHandling;

public class CheckTryReturn {

	public static void main(String[] args) {
	    System.out.println(CheckTryReturn.test());
	}

	@SuppressWarnings("finally")
	public static int test() {
	    try {
	    	//throw new NullPointerException();
	        return 1;
	    }
	    catch(Exception e) {
	    	return 8;
	    }
	    /*finally {
	        System.out.println("finally trumps return.");
	        return 9;
	    }*/
	}
}
