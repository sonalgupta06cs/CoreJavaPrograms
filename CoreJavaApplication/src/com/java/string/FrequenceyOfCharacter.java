package com.java.string;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenceyOfCharacter {

	/**
	 * Method to find out the frequency of each character
	 * @param str
	 */
	private static void printCharWithFreq(String str) {
			       
	       HashMap<Character, Integer> charCountMap = new LinkedHashMap<>();
	       char[] chArr = str.toCharArray();
	       for(char ch : chArr) {
	           if(charCountMap.containsKey(ch)) { //geeksforgeeks
	        	   
	               // If char is present in charCountMap, 
	               // incrementing it's count by 1 
	        	   charCountMap.put(ch, charCountMap.get(ch)+1);
	           }else {
	        	    // If char is not present in charCountMap, 
	                // putting this char to charCountMap with 1 as it's value 
	        	    // keep the count as 1 for all newly added characters
	        	   charCountMap.put(ch, 1); 
	           }
	       }   
	    
	       int counter = 0;
	       // Find out the maximum value of a Map
	       int maxValueInMap = Collections.max(charCountMap.values());
	       
	       for(Map.Entry<Character, Integer> mapEntry : charCountMap.entrySet()) {
	    	   
	    	   System.out.println("mapEntry "+mapEntry);
	    	   
	    	   // First Non-Repetitive Character
	    	   if(mapEntry.getValue() == 1 && counter == 0) {
	        	   counter++;
	        	   System.out.println("First Non-repetetive char is "+mapEntry.getKey());
	           }
	    	   
	    	   // Top-Most Repetitive Character
	    	   if(mapEntry.getValue() == maxValueInMap) {
	        	   System.out.println("Most repetetive char is "+mapEntry.getKey());
	           }
	    	   
	           System.out.println("Key "+mapEntry.getKey() +" , "+"Value "+mapEntry.getValue());
	           
	           
	    	   
	    	    
	           
	       }
		
	}
	
	public static void main(String[] args) {
		
		
		String str = "geeksforgeeks"; 
		System.out.println("******"+ str +"*******");
        printCharWithFreq(str); 
        
        
        String str1 = "SWISS";
        System.out.println("\n******"+ str1 +"*******");
        printCharWithFreq(str1); 
	}

}
