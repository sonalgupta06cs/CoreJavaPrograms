package com.java.integer;

/**
 * Check whether if the given number is Happy or Not.
 * 
 * Take any positive integer, find the sum of the squares of its digits, repeat
 * this process until you get 1, or if the sum equals 4 (i.e repeats the cycle
 * again).
 * 
 * If the sum equals 1 (in the process) then the given number is "happy",
 * otherwise it is an "unhappy" number (or sad number).
 * 
 * 32 is a happy number 	
   3*2 + 2*2 = 13   , 2 is pow on right
   1*2 + 3*2 = 10
   1*2 + 0*2 = 1
  
  7
  7^2 = 49
  4^2 + 9^2 = 97
  9^2 + 7^2 = 130
  1^2 + 3^2 + 0^2 = 10
  1^2 + 0^2 = 1
 * 
 * 
 * 1,7,10,13, 19,23
 * @author SonaSach
 *
 */
public class HappyNumber {

	public static void main(String[] args) {

		int n = 32; // 1,7,22

		boolean isHappy = isHappyNumber(n);

		if (isHappy) {
			System.out.println(n + " is a Happy number");
		} else {
			System.out.println(n + " is an Unhappy number");
		}

	}

	private static boolean isHappyNumber(int n) {

		int slow, fast; 
		   
	    //  initialize slow and fast by n 
	    slow = fast = n; 
		
	    do
	    { 
	        //  move slow number 
	        // by one iteration 
	        slow = squaresumOfInteger(slow); 
	   
	        //  move fast number 
	        // by two iteration 
	        fast = squaresumOfInteger(squaresumOfInteger(fast)); 
	   
	    } 
	    while (slow != fast); 
	   
	    //  if both number meet at 1, 
	    // then return true 
	    return (slow == 1); 
	}

	public static int squaresumOfInteger(int num) {
		int sum = 0;
		int mod;
		while (num != 0) {

			mod = num % 10;
			sum += mod * mod;
			num = num / 10;
			
		}

		return sum;

	}
}
