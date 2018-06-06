package com.java.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTraversal {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("b", 2);
		map.put("v", 3);
		map.put("h", 6);
		map.put("u", 8);
		map.put("o", 1);
		map.put("q", 19);
		
		System.out.println("Keys ");
		for(String keys : map.keySet() ) {
			System.out.println(keys);
		}
		
		System.out.println("Values ");
		for(Integer values : map.values()) {
			System.out.println(values);
		}
		
		for(Map.Entry<String, Integer> mapEntry : map.entrySet()) {
            System.out.println("Key "+mapEntry.getKey() +" , "+"Value "+mapEntry.getValue());
        }
		
		// Using iterators
		System.out.println("Using iterators");
		Iterator<Map.Entry<String, Integer>> mapEntry = map.entrySet().iterator(); 
			while(mapEntry.hasNext()) {
				Map.Entry<String, Integer> mapVal = mapEntry.next();
				System.out.println(mapVal.getKey() + " "+mapVal.getValue());
			}
			
		System.out.println("Using foreach");	
		// ForEach Method in Java 8
		map.forEach((k,v) -> System.out.println(k+","+v));	
			
		}
	}

