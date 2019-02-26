package com.java.string;

public class StringPalindrome {
	
	private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }



public static void main(String []args){
        
        String straight = "aabaa";
        System.out.println(isPalindromeString(straight));
        /*String reverse = "" ;
        //System.out.println(str.length()+" "+str.charAt(5));
        for(int i=straight.length()-1; i>=0; i--){
            reverse = reverse + straight.charAt(i);
            //System.out.println("i "+i+" ");
        }
        System.out.println(reverse+" "+straight);
        if(reverse.equals(straight)){
            System.out.println("Palindrome");
        }
        else 
           System.out.println("Not Palindrome");*/
        
     }
}
