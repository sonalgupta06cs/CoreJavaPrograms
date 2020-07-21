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
		
		// false, put it into (), which evaluates to true then
		System.out.println("str1 == str2 : "+ (str1==str2)); 
		
		System.out.println("str3 == str4 : "+ str3==str4); // false
		
		System.out.println("*****************************************");
		
		String s1 = "abc";
        String s2 = "abc";
        String s3= new String("abc");
        System.out.println("s1 == s2 ? "+(s1==s2)); //true
        System.out.println("s1 == s3 ? "+(s1==s3)); //false
        System.out.println("s1 equals s3 ? "+(s1.equals(s3))); //true
        
        System.out.println("**** String *********");
        String str = new String("pankaj");
		String str_1 = new String("PANKAJ");
		System.out.println("str == str_1 : "+ (str==str_1));  // false
		System.out.println("str == str_1 : "+ (str.equalsIgnoreCase(str_1))); // true
		System.out.println("str = str_1 : "+ (str=str_1)); // PANKAJ
		

	}

}
