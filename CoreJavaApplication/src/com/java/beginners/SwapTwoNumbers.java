package com.java.beginners;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		int temp = 0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 "+num1+" , num2 "+num2);

		
		int first = 12, second = 24;
		
		second = first-second; // -10
		first = first-second; // 30--10 = > 40
		second = first+second;//30
		
		System.out.println("num3 "+first+" , num4 "+second);
	}

}
