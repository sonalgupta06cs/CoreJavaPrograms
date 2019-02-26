/**
 * 
 */
package com.java.java8Features.functionalInterface;

/**
 * @author SonaSach
 *
 */

@FunctionalInterface
public interface FuncInterface1 {
	
	public void display(); // 1st abstract method
	
	//void letsGo();      //invalid because another abstract method is not allowed
	
	public static void show() { // static method
		
	}
	public default void visible() { // default method
		
	}
    public default void visible1() { // default method
		
	}
    default void showing() {}  // valid default method
    
    //This static method cannot hide the instance method from Object
  	//static String toString() {} 
    
    public String toString(); // valid because toString is from Object 
    public boolean equals(Object o);  //  valid because equals(Object) is from Object 
    
	//trying to override Object method gives compile time error as
	//"A default method cannot override a method from java.lang.Object"
	
	//	default String toString(){
	//		return "i1";
	//	}
   

}
