/**
 * 
 */
package com.java.string;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author SonaSach
 *
 */
public class RemoveDuplicateCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

           String str = "sdbdjfbamabasddk";
           String finalStr = removeDuplicateCharsUsingAL(str);
           System.out.println("list "+finalStr);
           String finalStr1 = removeDuplicateCharsUsingSet(str);
           System.out.println("set "+finalStr1);

	}

	/**
	 * Using Set
	 * @param str
	 * @return
	 */
	private static String removeDuplicateCharsUsingSet(String str) {
		
		char[] charArray = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		// LinkedHashSet maintains the insertion order whereas HashSet does not maintain
		for(char ch:charArray) {
		   set.add(ch);
		}	
		
		String setFinal = set.toString();
		
		return setFinal;
	}

	private static String removeDuplicateCharsUsingAL(String str) {
		
		char[] charArray = str.toCharArray();
		List<Character> list = new ArrayList<>();
		
		for(char ch:charArray) {
		    if(!list.contains(ch)) {
		    	list.add(ch);
		    }
		}	
		
		return list.toString();
	}

}
