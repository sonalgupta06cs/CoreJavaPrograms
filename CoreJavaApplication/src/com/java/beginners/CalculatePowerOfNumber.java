package com.java.beginners;

public class CalculatePowerOfNumber {

	public static void main(String[] args) {

		powUsingFor();	
		powUsingMath();

	}

	private static void powUsingMath() {
		int number = 10, p = 3;
        double result = Math.pow(number, p);
        System.out.println(number+"^"+p+" = "+result);
	}

	private static void powUsingFor() {
		// Here number is the base and p is the exponent
        int num = 2, pow = 5;
        int result = 1 ;
        
        // Copying the exponent value to the loop counter
        //int i = 0;
        for(int i = 1; i<= pow ; i++) {
        	result *= num;
        }
        
        //Displaying the output
        System.out.println(num+"^"+pow+" = "+result);
	}

}
