package com.java.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAdditionWhileIterating {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		System.out.println(" newListSize after initialization "+list1.size());
		
		list.add("1");
		/*
		 * list.add("1"); list.add("1"); list.add("1"); list.add("1"); list.add("1");
		 * list.add("1"); list.add("1");
		 */
		
		list.forEach(System.out::print);
		System.out.println(" size "+list.size());
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next());
			
			list1.add("2");
			list1.add("2");
			list1.add("2");
			
		}
		
		
		  for(String s: list) {
		  
		  list.add("2"); System.out.print(" "+s);
		  
		  }
		 
		
		System.out.println(" newListSize "+list1.size());
		
	}

}
