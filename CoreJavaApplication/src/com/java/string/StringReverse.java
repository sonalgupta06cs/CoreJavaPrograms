package com.java.string;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Sonal Gupta";

		//String finalReversed = reverseUsingNormal(str);
		//System.out.println("Normal Method String --> " + finalReversed);

		//String finalReversedRecursed = reverseUsingRecursion(str);
		//System.out.println("Recursion Method String --> " + finalReversedRecursed);

		String finalReversedSwapped = reverseUsingSwapping(str);
		System.out.println("Swapped Method String --> " + finalReversedSwapped);

	}

	/**
	 * Reverse using swapping last word with first word and so on 
	 * @param str
	 * @return
	 */
	private static String reverseUsingSwapping(String reverseString) {
		
		try {
			
			if(reverseString.equals(null) || reverseString.isEmpty()) {
				return "";
			}
			char[] charArray  = reverseString.toCharArray();
			int left=0, right = reverseString.length()-1;
			char temp;
			
			for(left=0; left<right; left++, right--) {
				
				temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
			}
			
			return String.valueOf(charArray);
		} catch(Exception e) {
			
		}
		return "";	
	}

	/**
	 * Using Recursion Method
	 * 
	 * @param str
	 *            --> Sonal
	 * @return
	 */
	private static String reverseUsingRecursion(String str) {

		if (str.length() == 0) {
			return str;
		}

		return reverseUsingRecursion(str.substring(1)) + str.charAt(0);

	}

	/**
	 * Too much memory issues, so many string will get created with this approach
	 * 
	 * @param str
	 * @param result
	 * @return
	 */
	private static String reverseUsingNormal(String str) {
		StringBuilder result = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			result.append(str.charAt(i));
		}
		return result.toString();
	}

}
