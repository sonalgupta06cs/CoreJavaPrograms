package com.java.string;

import java.util.StringTokenizer;

public class StringWordCount {

	public static void main(String[] args) {
		
		String str = "Sonal Gupta";
		
		// using split method
		String[] wordArray = str.trim().split("\\s+");
		System.out.println("Count of words "+wordArray.length);
		
		// using StringTokenizer method
		StringTokenizer tokenizer = new StringTokenizer("Sonal Gupta", " ");
		System.out.println("words or tokens "+tokenizer.countTokens());

	}

}
