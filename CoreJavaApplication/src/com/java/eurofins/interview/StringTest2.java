package com.java.eurofins.interview;

/**
 * @author SonaSach
 *
 */
public class StringTest2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		String str1 = new String("abc");
		String str2 = str1.intern();
		
		System.out.println(str1 +" : "+ str2);
		System.out.println(str1==str2);
		

	}

}
