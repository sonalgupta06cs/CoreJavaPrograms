package com.java.string;

public class StringReverse {

	public static void main(String[] args) {
		
		String str ="Sonal Gupta";
		StringBuilder result = new StringBuilder();
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			result = result.append(str.charAt(i));
		}
		System.out.println(result);

	}

}
