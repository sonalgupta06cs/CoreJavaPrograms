package com.java.mix;

public class BooleanAssignment {

	public static void main(String[] args) {
	
		boolean one = true;
		boolean two = false;
		
		if(one = false)
		{
			System.out.println("In = false --> "+one);
		}	
		if(one = true)
		{
			System.out.println("In = true --> "+one);
		}	
		if(one = two)
		{
			System.out.println("Done One "+one +"two "+two);
		}	
		if(!one)
		{
			System.out.println("NotOne");
		}	

	}

}
