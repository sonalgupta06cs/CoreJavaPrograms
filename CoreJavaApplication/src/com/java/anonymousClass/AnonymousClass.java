package com.java.anonymousClass;

//Java program to demonstrate Anonymous inner class
interface Age
{
	int x = 21;
	void getAge();
}
class AnonymousDemo
{
  	static Age oj1 = new Age() {

			@Override
			public void getAge() {
				// printing age
				System.out.print("Age is "+x);
			}
		};

}
public class AnonymousClass extends AnonymousDemo{
  
  	public static void main(String[] args) {

		oj1.getAge();
	}
  
}