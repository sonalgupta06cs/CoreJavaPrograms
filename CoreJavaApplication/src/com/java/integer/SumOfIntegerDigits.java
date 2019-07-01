package com.java.integer;

public class SumOfIntegerDigits {

	public static void main(String[] args) {
		
		int i=678;
		
		int sum = sumOfInteger(i);
		System.out.println(sum);

	}
	
	public static int sumOfInteger(int num){
		int sum = 0;
		int mod;
		while(num != 0) {
			
			mod = num%10;
			System.out.println("mod "+mod);
			num = num/10;
			System.out.println("num "+num);
			
			sum+=mod;
		}
		
		return sum;
		
	}

}
