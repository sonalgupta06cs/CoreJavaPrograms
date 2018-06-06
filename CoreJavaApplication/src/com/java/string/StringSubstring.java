package com.java.string;

import java.util.Scanner;

public class StringSubstring {

	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Please enter a substring String: ");
	        String string1 = input.next();
	        System.out.print("Please enter a String: ");
	        String string2 = input.next();
	        if (isSubstring(string1, string2)) {
	            System.out.println("The first string is a substring of the second.");
	        } else {
	            System.out.println("The first string is NOT a substring of the second.");
	        }
	    }   
	    public static boolean isSubstring(String string1, String string2) {
	        char c;
	        char d;
	        boolean match = true;
	        for (int i = 0; i < string1.length(); i++) { //4
	                c = string1.charAt(i); // sona // at
	           for (int j = 0; j < string2.length(); j++) { //5
	                d = string2.charAt(i); // sonal // ducat
	                if (c == d) {
	                    match = true;
	                } else {
	                    match = false;
	                }   
	            }     
	        }
	        return match;
	    }

}
