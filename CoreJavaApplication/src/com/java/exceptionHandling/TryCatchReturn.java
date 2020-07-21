/**
 * 
 */
package com.java.exceptionHandling;

/**
 * @author sgupta
 *
 */
public class TryCatchReturn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = null;
		//String ss = str.equals("ABC")?"a":"b"; // this will thorw the null pointer exception.
		boolean equalsStr = "ACS".equals(str); // this wont return the null pointer exception, hence it's the best practice.
        System.out.println(testReturn()+" "+equalsStr);

	}

	private static int testReturn() {
		
		try {
			//System.out.println("try");
			//int a = 10/0;
			
			return 1;
		}
		catch(Exception e){
			return 2;
		}
		finally {
			System.out.println("finally");
		    //return 9;
		}
	}

}
