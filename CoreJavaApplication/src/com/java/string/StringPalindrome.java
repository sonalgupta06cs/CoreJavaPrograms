package com.java.string;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "aabaa"; //aabaa
         String pal = "";
         String revPal = "";
         int leng = str.length();
         System.out.println("length "+leng);
         
         for(int i = 0; i<leng ; i++) {
        	  pal = pal + str.charAt(i);  
         }
         for(int j=leng-1; j>=0 ; j--) {
        	  revPal = revPal + str.charAt(j);  
        }
         
         System.out.println(pal+" "+revPal);
         
         if(pal.equals(revPal)) {
        	 System.out.println("String is palindrome");
         }
         else {
        	 System.out.println("not palindrome");
         }         
	}

}
