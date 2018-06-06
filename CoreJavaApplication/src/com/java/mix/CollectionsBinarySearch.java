package com.java.mix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsBinarySearch {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(Collections.binarySearch(list, 1));

	}

}
