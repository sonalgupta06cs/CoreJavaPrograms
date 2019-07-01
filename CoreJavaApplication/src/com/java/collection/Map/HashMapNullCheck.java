package com.java.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapNullCheck {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
        map.put(null, "one");
        map.put(null, null);
        System.out.println(map.size());
        
        
        map.forEach((k,v) -> System.out.println(k+ " " +v));
		 
		
	}

}
