/**
 * 
 */
package com.java.string;

/**
 * @author SonaSach
 *
 */
public class PermutationString {
	
	protected static String[] permutationForString(String str) {
		
		char[] chArr = str.toCharArray();
		for(char ch : chArr) {
			
		}
		
		return null;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "word";
        String[] strPer = permutationForString(str);
        for(String finalStr : strPer) {
        	System.out.println(finalStr);
        }
	}

	

}
