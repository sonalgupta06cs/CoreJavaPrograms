package com.java.singleton;

class Test {

	private static volatile Test instance;

	private Test() {

		System.out.println("Instance is created");
	}

	public static Test getInstance() {
		if (instance == null) {
			synchronized (Test.class) {
				if (instance == null)
					instance = new Test();
			}
		}
		return instance;
	}
}

public class SingletonThreadsafe {

	public static void main(String[] args) {

		Test threadsafe = Test.getInstance();
		Test threadsafe1 = Test.getInstance();

	}
}

/*
 * Thread safety is guaranteed Client application can pass arguments Lazy
 * initialization achieved Synchronization overhead is minimal and applicable
 * only for first few threads when the variable is null.
 */
