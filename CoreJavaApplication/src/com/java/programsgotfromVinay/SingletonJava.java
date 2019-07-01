package com.java.programsgotfromVinay;

public class SingletonJava {
	
	public static void main(String[] args) {
		
		SingletonTest testObj = SingletonTest.getInstance();
		SingletonTest testObj1 = SingletonTest.getInstance();
		
	}

}
class SingletonTest {
	
    private static volatile SingletonTest singletonTest;
	
    private SingletonTest() {
    	System.out.println("Instance is created");
	}
	
	public static SingletonTest getInstance() {
		
		    synchronized (SingletonTest.class) {
			
				if(singletonTest == null) {
					singletonTest = new SingletonTest();
				}
		    }		
		
		return singletonTest;
	}
	
}

/**
 * We are creating instance lazily at the time the first request comes.
 * 
 * If we do not make the _instance variable volatile then the Thread which 
 * is creating the instance of Singleton is not able to communicate to the other thread. 
 * So if Thread A is creating Singleton instance and just after creation, the CPU corrupts etc, 
 * all other threads will not be able to see the value of _instance as not null and they will 
 * believe it is still assigned null.
 */ 
