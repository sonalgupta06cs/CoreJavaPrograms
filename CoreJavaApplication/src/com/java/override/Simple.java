package com.java.override;

class A {
	protected void msg() {
		System.out.println("Hello java");
	}
}

public class Simple extends A {
	//void msg() // uncomment this to see the error
	{
		System.out.println("Hello java");
	}// C.T.Error

	public static void main(String args[]) {
		Simple obj = new Simple();
		obj.msg();
	}
}

//If you are overriding any method, overridden method (i.e. declared in subclass)
//must not be more restrictive, cant make it default access mdifier