package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import datastructures.Lists.ReverseLinkedList;

	public class AnagramCheck {
	   
	    /*
	     * One way to find if two Strings are anagram in Java. This method
	     * assumes both arguments are not null and in lowercase.
	     *
	     * @return true, if both String are anagram
	     */
	    public static boolean isAnagram(String word, String anagram){       
	        if(word.length() != anagram.length()){
	            return false;
	        }
	       
	        char[] chars = word.toCharArray();
	       
	        for(char c : chars){
	            int index = anagram.indexOf(c);
	            if(index != -1){
	                anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
	            }else{
	                return false;
	            }           
	        }
	       
	        return anagram.isEmpty();
	    }
	   
	    /*
	     * Another way to check if two Strings are anagram or not in Java
	     * This method assumes that both word and anagram are not null and lowercase
	     * @return true, if both Strings are anagram.
	     */
	    public static boolean iAnagram(String word, String anagram){
	        char[] charFromWord = word.toCharArray();
	        char[] charFromAnagram = anagram.toCharArray();       
	        Arrays.sort(charFromWord);
	        Arrays.sort(charFromAnagram);
	       
	        return Arrays.equals(charFromWord, charFromAnagram);
	    }
	   
	   
	    public static boolean checkAnagram(String first, String second){
	        char[] characters = first.toCharArray();
	        StringBuilder sbSecond = new StringBuilder(second);
	       
	        for(char ch : characters){
	            int index = sbSecond.indexOf("" + ch);
	            if(index != -1){
	                sbSecond.deleteCharAt(index);
	            }else{
	                return false;
	            }
	        }
	       
	        return sbSecond.length()==0 ? true : false;
	    }
	
	    public static char firstNonRepeatingChar(String word) {
	    	Set<Character> repeating = new HashSet<>(); 
	    	List<Character> nonRepeating = new ArrayList<>(); 
	    	for (int i = 0; i < word.length(); i++) {
	    		char letter = word.charAt(i); 
	    		if (repeating.contains(letter)) {
	    			continue; 
	    			} 
	    		if (nonRepeating.contains(letter)) {
	    			nonRepeating.remove((Character) letter);
	    			repeating.add(letter); } else {
	    				nonRepeating.add(letter); } 
	    		} return nonRepeating.get(0); }
	    
	  private static void permutation(String perm, String word) { 
		if (word.isEmpty()) { 
			System.err.println(perm + word); 
			} else { 
				for (int i = 0; i < word.length(); i++) {
					permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); 
					} 
				} 
		}
	
	public static boolean checkRotatation(String original, String rotation) {
		if (original.length() != rotation.length()) {
			return false;
		}
		String concatenated = original + original;
		if (concatenated.indexOf(rotation) != -1) {
			return true;
		}
		return false;
	}
	
	private static String reverse(String input){
		if(input == null || input.isEmpty()){ return input; }

		return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
	}
	private static void permutationRecursive(String perm, String word) { 
		
		if(word.isEmpty()){
			//print the owrd+perm
		}else{
			for(int i=0;i<word.length();i++){
				permutationRecursive(perm+word.charAt(i), word.substring(0,i)+word.substring(i+1,word.length()));
			}
			
		}
	}
	

	
	     public static void main(String args[]){
	    	
	    	//isAnagram("word", "wrdo");
	    	//checkAnagram("word", "wrdo");
	    	//firstNonRepeatingChar("swiss");
	    	  permutation("","123");
	    	// System.out.println(reverse("sahana"));
	    	 
	    	
	    	 
	    	
	    }
}