package com.java.eurofins.interview;

/**
 * @author SonaSach
 *
 */
public class StringTest1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("cde");
		String str4 = new String("cde");
		
		System.out.println("str1 == str2 : "+ str1==str2);
		System.out.println("str3 == str4 : "+ str3==str4);
		

	}

}
