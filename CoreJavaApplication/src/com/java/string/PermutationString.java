/**
 * 
 */
package com.java.string;

/**
 * @author SonaSach
 *
 */
public class PermutationString { // 123
	
	protected static void permutation(String perm, String word) {
		
		//System.out.println("test "+perm +" "+word);
		
		if(word.isEmpty()) {
			System.out.println(perm + word);
		}
		else {
			for(int i=0;i<word.length();i++) {
				
				permutation(perm+word.charAt(i), 
						                  word.substring(0,i)+word.substring(i+1, word.length()));
				
				//permutation(1, 23);
				
			}
		}
		 
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String word = "123";
        permutation("", word);
	}

	

}
