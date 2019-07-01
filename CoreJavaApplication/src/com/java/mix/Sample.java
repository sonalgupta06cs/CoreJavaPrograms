package com.java.mix;
abstract class SampleImpl
 {
	
		public SampleImpl() {System.out.println("Abstract Constructor");}
		public abstract void run(); // abstract method
	    public static int mul(){return 3*2;} // static method
	    /*public static void main(String[] args) 
	    { // Static method that can be accessed without instantiation 
	         System.out.println("Your abstract no is : " + SampleImpl.mul());
	    }*/
 }
class Sample extends SampleImpl{

	public Sample() {
		
	}
	
	@Override
	public void run() {
		System.out.println("Run Method");
		
	}
	
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.run();
	}
	
}
