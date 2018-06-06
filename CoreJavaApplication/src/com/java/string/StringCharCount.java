package com.java.string;

public class StringCharCount {

	public static void main(String[] args) {
		
		String str = "Sonal Gupta";
		int spaceCount=0, charCount = 0;
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i) == ' ') {
				spaceCount++;
			}
			else
				charCount++;
			
		}
		
		System.out.println("charCount "+charCount);
		System.out.println("spaceCount "+spaceCount);
	}

}
