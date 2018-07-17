package com.java.anonymousClass;

//Java program to demonstrate Anonymous inner class
interface Age1
{
	int x = 21;
	void getAge();
}
class AnonymousDemos
{
  	Age1 obj1 = new Age1() {

			@Override
			public void getAge() {
				// printing age
				System.out.print("Age is "+x);
			}
		};

}
public class AnonymousClass1 extends AnonymousDemo{
  
  	public static void main(String[] args) {

		oj1.getAge();
	}
  
}