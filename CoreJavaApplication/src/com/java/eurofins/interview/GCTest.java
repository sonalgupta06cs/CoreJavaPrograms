package com.java.eurofins.interview;

/**
 * @author SonaSach
 *
 */
public class GCTest {
	
	static GCTest t;
	static int count=0;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		
		GCTest t1 = new GCTest();
		t1 = null;
		
		System.gc();
		
		Thread.sleep(1000);		
		t = null;
		System.gc();
		
		Thread.sleep(1000);
		
		System.out.println("finalize method called "+count+" times");
        // finalize method called 1 times
	}
	
	@Override
	protected void finalize() {
		count++;
		t = this;
	}

}

