package com.java.programsgotfromVinay;

public class DecimalToBinaryConUsingNumericOp {

	public static void main(String[] args) {
		
		decimalNumber(17);

	}

	private static void decimalNumber(int number) {
		
		int[] binaryArr = new int[10];
		int i=0;
		
		while(number>0)
		{
		   // to find the remainder	
		   binaryArr[i]	= number%2;
		   // to find the divider to do modulus operation again
		   number  = number/2;
		   i++;
		}	
		
		//System.out.println(i);
		
		for(int j=i-1 ; j>=0 ; j--) {
			System.out.println(binaryArr[j]);
		}
		
	}

}
