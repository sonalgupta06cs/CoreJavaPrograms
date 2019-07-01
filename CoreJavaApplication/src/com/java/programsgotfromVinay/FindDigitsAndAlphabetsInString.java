/**
 * 
 */
package com.java.programsgotfromVinay;

/**
 * @author SonaSach
 *
 */
public class FindDigitsAndAlphabetsInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "This website is aw3som3.";
		findDigitsAndAlpha(str);

	}

	private static void findDigitsAndAlpha(String str) {

		int dCounter = 0, aCounter = 0, special = 0, spaces = 0;
		str = str.toLowerCase();
		char chArr[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			// check alphabets
			if ((chArr[i] >= 'a' && chArr[i] <= 'z')) {
				++aCounter;
			} else if (chArr[i] >= '0' && chArr[i] <= '9') {
				++dCounter;
			} else if (chArr[i] == ' ') {
				++spaces;
			} else {
				++special;
			}
		}

		System.out.println("aCounter: " + aCounter + " " + "dCounter: " + dCounter + " "
				+ " spaces: " + spaces + " special: " + special);
	}

}
