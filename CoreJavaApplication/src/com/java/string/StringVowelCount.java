package com.java.string;

public class StringVowelCount {

	public static void main(String[] args) {
		
		String str = "Sonal";
		System.out.println("No. of Vowels count is "+countVowels(str));

	}

	/**
	 * 
	 * @param str to count the vowels for
	 */
	private static int countVowels(String str) {
	
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'  
					|| str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				
				count++;

			}
		}
		
		return count;
	}

}
