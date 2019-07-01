package com.java.Array;

public class SumOfPositiveIntegers {

	public static void main(String[] args) {
		
		int[] intArr = new int[] {1, 5, 10, -5, -10};
		
		MyResult finalResult = sumIntergersAdd(intArr);
		System.out.println(finalResult.getSumPositive() +" -> "+finalResult.getSumNegative());

	}

	private static MyResult sumIntergersAdd(int[] intArr) {
		
		int sumPositive =0 , sumNegative = 0;
		
		int size = intArr.length;
		
		for(int i=0; i<size; i++) {
			
			if(intArr[i] < 0) {
				
				sumNegative += intArr[i];

			} else {
				
				sumPositive += intArr[i];
			
			}
			
		}
		
		//System.out.println(sumNegative+ " - " +sumPositive);
		return new MyResult(sumPositive, sumNegative);
		
	}

}
