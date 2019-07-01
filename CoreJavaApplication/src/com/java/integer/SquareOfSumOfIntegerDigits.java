package com.java.integer;

public class SquareOfSumOfIntegerDigits {

public static void main(String[] args) {
		
		int i=678;
		
		int sum = squaresumOfInteger(i);
		System.out.println(sum);

	}
	
	public static int squaresumOfInteger(int num){
		int sum = 0;
		int mod;
		int sq = 0;
		while(num != 0) {
			
			mod = num%10;
			sq = mod * mod;
			System.out.println("mod "+mod);
			num = num/10;
			System.out.println("num "+num);
			
			sum+=sq;
		}
		
		return sum;
		
	}
}
