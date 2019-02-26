/**
 * 
 */
package com.java.string;

/**
 * @author SonaSach
 *
 */
public class GetLast3CharsString {

	private static String get3CharsString(String word) {
		
		if (word.length() == 3) {
			return word;
		} else if (word.length() > 3) {
			return word.substring(word.length() - 3);
		} else {
			// whatever is appropriate in this case
			throw new IllegalArgumentException("word has less than 3 characters!");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String word = "onetwotwoone";

		String str = get3CharsString(word);
		System.out.println("last3chars "+str);
	}

}
