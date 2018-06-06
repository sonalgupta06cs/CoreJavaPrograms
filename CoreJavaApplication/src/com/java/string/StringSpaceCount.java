package com.java.string;

public class StringSpaceCount {

	public static void main(String[] args) {
		
		String str = "Sonal Gupta BE";
		int spaceCount = 1;
		
		for(int i = 0; i<str.length() ; i++)
		{
			if(str.charAt(i) == ' ') 
				spaceCount++;
		}	
		
		System.out.println("wordCount "+spaceCount);
		System.out.println("spaceCount "+(spaceCount-1));
		
		//-------------------------------------------------------------------------------
		
		
		
		String str1 = "Sonal Gupta";
		int strLength = str1.length();
		String[] st = str1.split("\\s");
		System.out.println("space count "+((st.length)-1));

	}

}
