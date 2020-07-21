/**
 * 
 */
package com.java.eurofins.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SonaSach
 *
 */
public class HashCodeEqualsOverridden {
	
	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals");
		return true; // check with true and false
	}
	
	@Override
	public int hashCode() {
		//System.out.println("hashcode");
		return 1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map map = new HashMap<>();
		map.put(new HashCodeEqualsOverridden() , 1);
		map.put(new HashCodeEqualsOverridden() , 2);
		map.put(new HashCodeEqualsOverridden() , 3);
		
		System.out.println(map.size());

	}

}

// O/p:- when equals returns true, result is 1
//O/p:- when equals returns false, result is 3
