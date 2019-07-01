package com.java.programsgotfromVinay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MakeCollectionAsReadableOnly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Sonal");
		list.add("Sachin");
		list.add("Sonal");
		
		list = Collections.unmodifiableList(list);
		
		/*list.forEach(l -> System.out.print(l));
		
		System.out.println("");
		
		list.add("Test");
		
		list.forEach(l -> System.out.print(l));
		
		System.out.println("");*/
		
		Set<String> set = new HashSet<String>();
        set.add("Sonal");
        set.add("Sachin");
        set.add("Sonal");
        
        set.forEach(l -> System.out.print(l));
        System.out.println("");
        
        //set = Collections.unmodifiableSet(set);
        
        set.add("Test");
        
        set.forEach(l -> System.out.print(l));
        System.out.println("");
        
       Map<String,Integer> map = new HashMap<String,Integer>();
       map.put("Sonal", 1);
       map.put(null,null);
       map.put(null,2);
       
       for( Map.Entry<String, Integer> mapEntry : map.entrySet()) {
    	   System.out.println("Key "+mapEntry.getKey() +" , "+"Value "+mapEntry.getValue());
       }
       
       map = Collections.unmodifiableMap(map);
       
       //map.put("Sonal", 1);
       
       //map.forEach(l -> System.out.println(l));
	}

}
