package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

public class AnagramCheck {
	
	final static Logger logger = Logger.getLogger(AnagramCheck.class);

	protected static boolean isAnagram(String str, String word) {
		
		str = str.toLowerCase();
		word = word.toLowerCase();
		
		StringBuilder stringWord = new StringBuilder(word);
		
		if(str.length() != word.length()) {
			System.out.println("not anagram");
			return false;
		}else {
		
			char[] charStr = str.toCharArray(); // word
			for(char c : charStr) {
				int index = word.indexOf(c); // ordw
				//System.out.println(index);
				if(index != -1) { // integrak word does have c char or not?  integrak.indexOf(t) = 2
				   
					//word = word.substring(0, index) + word.substring(index+1,word.length());
					// or remove that word from that location.
					stringWord.deleteCharAt(index);
					word = stringWord.toString();
					
					//System.out.println(word);
					if(word.isEmpty())
					{
						logger.info("Anagram");
					}	
				}else {
					logger.info("Not Anagram");
					return false;
				}
			}
		}
		return word.isEmpty();
	}
	
   protected static boolean checkAnagram(String str, String word) {
		
		str = str.toLowerCase();
		word = word.toLowerCase();
		
		char strArr[] = str.toCharArray();
		char wordArr[] = word.toCharArray();
		
		Arrays.sort(strArr);
		Arrays.sort(wordArr);
		
		boolean result = Arrays.equals(strArr, wordArr);
		System.out.println(result);
		
		return result;
	}
   
   
	
	
	
	public static void main(String[] args) {
		
		String str = "word";
		String word = "ordw";
		
		//boolean result = isAnagram(str, word);
		boolean result = isAnagramUsingCollection(str, word);
		System.out.println(" Word "+ word + " is anagram of "+str+" : "+result);

	}

	private static boolean isAnagramUsingCollection(String str, String anagram) {
		
		ArrayList<Character> list = new ArrayList<>();	
		char[] charArr = str.toCharArray();
		char[] charArr1 = anagram.toCharArray(); 		
		for(char c: charArr1) {
			list.add(c);	
		}
		
		
		if(str.length() != anagram.length()) {
			return false;
		}
		else {
			
			charArr = str.toCharArray();
			for(char ch : charArr) {

				int index = anagram.indexOf(ch);
				//System.out.println(index+" "+list+" "+anagram);
				
				if(index != -1) {
				   char removeChar = list.remove(index);
				   //System.out.println(removedCh);
				   
				   
				   
				   anagram = list.stream().map(Object::toString)
	                        .collect(Collectors.joining(""));
				   
				   System.out.println("after removal "+anagram);
				   
				   if(anagram.isEmpty()) {
					   System.out.println("Anagram");
				   }
				}else {
					   System.out.println("Not Anagram");   
				}	
			}	
			
		}
		
		return anagram.isEmpty();
	}

}
