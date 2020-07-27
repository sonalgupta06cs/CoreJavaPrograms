package com.java.beginners;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		generateFibonacciSeriesUsingForLoop(number);
		
		//generateFibonacciUsingWhileLoop(number);

	}

	private static void generateFibonacciUsingWhileLoop(int number) {
		        // 0 1 1 2 3 5 8 13 21...
				int n1 = 0;
				System.out.print(n1+" ");
				int n2 = 1;
				System.out.print(n2+" ");
				int result = 0, i = 1 ;
				while(i<= number) {
					result = n1+n2;
					System.out.print(result+" ");  // 0 1 1 2 3 5
					n1 = n2;
					n2 = result;
					
					i++;
				}
		
	}

	private static void generateFibonacciSeriesUsingForLoop(int number) {
		
		// 0 1 1 2 3 5 8 13 21...
		int n1 = 0;
		System.out.print(n1+" ");
		int n2 = 1;
		System.out.print(n2+" ");
		int result = 0;
		for(int i=1; i<=number ; i++) {
			result = n1+n2;
			System.out.print(result+" ");  // 0 1 1 2 3 5
			n1 = n2;
			n2 = result;
		}
	}

}
