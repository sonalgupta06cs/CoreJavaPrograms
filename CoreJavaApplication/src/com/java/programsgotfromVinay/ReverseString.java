package com.java.programsgotfromVinay;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Sonal Gupta";
		String reversed;
		
		//reversed = reverseStringUsingInbuiltMethod(str);
		//reversed = reverseStringUsingStrConcatenation(str);
		//reversed = reverseStringUsingSwapMethod(str);
		reversed = reverseStringUsingRecursion(str);
		System.out.println(reversed);

	}
  
	/**
	 * using recursion
	 * @param str to reverse "Sonal Gupta"
	 * @return the reversed string
	 */ 
	private static String reverseStringUsingRecursion(String str) {
		
		
		if(str.isEmpty()) {
		    return str;
		}
		else {
			return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
		}
		
	}


	/**
	 * using swap method
	 * @param str to reverse "Sonal Gupta"
	 * @return the reversed string
	 */
	private static String reverseStringUsingSwapMethod(String str) {
		
		int left=0, right=str.length()-1;
		char temp;
		
		char charArr[] = str.toCharArray();
		
		for(left=0; left<right ; left++, right--) {
			
			temp = charArr[left]; 
			charArr[left] = charArr[right];  
			charArr[right] = temp;
		}
		
		String reversedStr = "";
		for(char ch : charArr) {
			reversedStr = reversedStr.concat(String.valueOf(ch));
		}
		
		return reversedStr;
	}


	/**
	 * using string concatenation "+"
	 * @param str to reverse
	 * @return the reversed string
	 */
	private static String reverseStringUsingStrConcatenation(String str) {
		
		String reversed = "";
		
		for(int i=str.length()-1; i>=0 ; i--) {
			
			reversed += str.charAt(i);
			
		}
		return reversed;
	}

	/**
	 * using string builder method
	 * @param str to reverse
	 * @return the reversed string
	 */
	private static String reverseStringUsingInbuiltMethod(String str) {
		
		StringBuilder builder = new StringBuilder(str);
		return builder.reverse().toString();
	}

}
