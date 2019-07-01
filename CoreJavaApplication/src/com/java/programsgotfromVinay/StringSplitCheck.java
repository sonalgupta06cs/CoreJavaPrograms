package com.java.programsgotfromVinay;

public class StringSplitCheck {
	
	public static void main(String[] args) {
		String str="";
		String  test[] = str.split(" ");//.toString();
		System.out.println(test);
		
		char[] chArr = str.toCharArray();
		System.out.println("char "+ chArr);
	}

	@Override
	public String toString() {
		return "StringSplitCheck []";
	}

}
