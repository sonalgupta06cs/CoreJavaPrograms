/**
 * 
 */
package com.java.string;

/**
 * @author SonaSach
 *
 */
public class RemoveGivenWord {
	
	
	private static String removeWord(String str, String word) {
				
		String tempWord = "";
		if(str.contains(word)) {
			
			// if the word is at the end
			 tempWord =  " " + word;
			 str = str.replaceAll(tempWord, "");
			
			// if the word is at the beginning or middle
			tempWord = word + " ";
			str = str.replaceAll(tempWord, "");
			
		}
		
		return str;
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Test Case 1: 
        // If the word is in the middle 
        String string1 = "Geeks for Geeks."; 
        String word1 = "for"; 
  
        // Test Case 2: 
        // If the word is at the beginning 
        String string2 = "for Geeks Geeks."; 
        String word2 = "for"; 
  
        // Test Case 3: 
        // If the word is at the end 
        String string3 = "Geeks Geeks for."; 
        String word3 = "for"; 
  
        // Test Case 4: 
        // If the word is not present 
        String string4 = "A computer Science Portal."; 
        String word4 = "Geeks"; 
  
        // Test case 1 
        System.out.println("String: " + string1 
                           + "\nWord: " + word1 
                           + "\nResult String: "
                           + removeWord(string1, word1)); 
  
        // Test case 2 
        System.out.println("\nString: " + string2 
                           + "\nWord: " + word2 
                           + "\nResult String: "
                           + removeWord(string2, word2)); 
          
        // Test case 3 
        System.out.println("\nString: " + string3 
                           + "\nWord: " + word3 
                           + "\nResult String: "
                           + removeWord(string3, word3)); 

        // Test case 4 
        System.out.println("\nString: " + string4 
                           + "\nWord: " + word4 
                           + "\nResult String: "
                           + removeWord(string4, word4)); 
      } 

	}
