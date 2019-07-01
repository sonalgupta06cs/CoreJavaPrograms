package com.java.eurofins.interview;

public class Constructor {
	
	static String str;
	
	public void Constructor() {
	
		System.out.println("In constructor");
		str = "hello world";
		
	}
	

	public static void main(String[] args) {

		Constructor c = new Constructor();
		System.out.println(str);

	}

}
