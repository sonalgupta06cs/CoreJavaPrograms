package com.java.beginners;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		multiplicationTable(number);

	}

	private static void multiplicationTable(int number) {
		for(int i=1; i<=10 ; i++) {
			System.out.println(number+" * "+i +" = "+number*i);
		}
	}

}
