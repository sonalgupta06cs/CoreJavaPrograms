package com.java.beginners;

import java.util.Scanner;

public class CalculateLeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter the year:-");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		boolean isLeapYear = isLeapYear1(year);
		System.out.println(isLeapYear);
		
		isLeapYear = isLeapYear2(year);
		System.out.println(isLeapYear);

	}

	private static boolean isLeapYear2(int year) {
		 // Return true if year is a multiple 
	    // of 4 and not multiple of 100. 
	    // OR year is multiple of 400. 
		return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
	}

	private static boolean isLeapYear1(int year) {

        // If a year is multiple of 400,  
        // then it is a leap year 
		if(year % 400 == 0) {
			return true;
		} 
		
		// Else If a year is muliple of 100, 
        // then it is not a leap year 
		if(year % 100 == 0) {
			return false;
		}
		
		// Else If a year is muliplt of 4, 
        // then it is a leap year 
		if(year % 4 == 0) {
			return true;
		}
		
		return false;
	}

}
