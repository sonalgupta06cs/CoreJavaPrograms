package com.java.beginners;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		
		System.out.println("Enter the max number till you need the sum of natural numbers");
		Scanner scanner = new Scanner(System.in);
		int maxNo = scanner.nextInt();
		int sum = 0, i = 0;
		while(i <= maxNo) {
			sum+=i;
			i++;
		}
		System.out.println("sum is "+sum);

	}

}
