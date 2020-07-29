package com.java.string;

import java.util.ArrayList;
import java.util.List;

// Java Program to illustrate Pangram 
class Pangram  
{ 
  
    // Returns true if the string 
    // is pangram else false 
    public static String checkPangram (List<String> strs) 
    { 
        // Create a hash table to mark the  
        // characters present in the string 
        // By default all the elements of  
        // mark would be false. 
    	boolean result = false;
    	String finalResult;
        boolean[] mark = new boolean[26]; 
  
        // For indexing in mark[] 
        int index = 0; 
  for(String str : strs) {
        // Traverse all characters 
        for (int i = 0; i < str.length(); i++) 
        {
            // If uppercase character, subtract 'A' 
            // to find index. 
            if ('A' <= str.charAt(i) &&  
                    str.charAt(i) <= 'Z') 
                          
                index = str.charAt(i) - 'A'; 
  
                // If lowercase character, subtract 'a' 
                // to find index. 
            else if('a' <= str.charAt(i) &&  
                        str.charAt(i) <= 'z') 
                              
                index = str.charAt(i) - 'a'; 
  
            // Mark current character 
            mark[index] = true; 
        } 
  
        // Return false if any character is unmarked 
        for (int i = 0; i <= 25; i++) {
            if (mark[i] == false) 
            {
            	result = false;
            	finalResult = "false";
                return finalResult;
            }   
        }
     }   
        // If all characters were present 
        return "true";
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
         String str = "we promptly judged antique ivory buckles for the next prize"; 
    	//String str = "the quick brown fox jump over the lazy dog"; 
    	List<String> strList = new ArrayList<>();
        strList.add(str);  
        if (checkPangram(strList).equals("true")) 
            System.out.print(str + " is a pangram."); 
        else
            System.out.print(str+ " is not a pangram."); 
  
    } 
} 