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
/*
 * In object-oriented programming, a singleton class is a class that can have
 * only one object (an instance of the class) at a time. After first time, if we
 * try to instantiate the Singleton class, the new variable also points to the
 * first instance created. So whatever modifications we do to any variable
 * inside the class through any instance, it affects the variable of the single
 * instance created and is visible if we access that variable through any
 * variable of that class type defined. To design a singleton class:
 * 
 * a.) Make constructor as private. b.) Write a static method that has return
 * type object of this singleton class. Here, the concept of Lazy initialization
 * in used to write this static method.
 */
