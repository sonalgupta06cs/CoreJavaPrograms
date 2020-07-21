package com.java.exceptionHandling;

public class ExecutionOfFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = test();
		System.out.println(value);

	}

	static void something() {
		System.out.println("something");
	}

	public static String test() {
		try {
			something();
			return "test";
		} catch (Exception e) {
            System.out.println("in catch");
		} finally {
			System.out.println("i don't know if this will get printed out.");
			//return "exit";
		}
		System.out.println("checking if it comes here");
		return "exit";
	}

}

/*
 * Yes, finally will be called after the execution of the try or catch code
 * blocks.
 * 
 * The only times finally won't be called are:
 * 
 * If you invoke System.exit(); If the JVM crashes first; If the JVM reaches an
 * infinite loop (or some other non-interruptable, non-terminating statement) in
 * the try or catch block; If the OS forcibly terminates the JVM process; e.g.
 * "kill -9 " on UNIX. If the host system dies; e.g. power failure, hardware
 * error, OS panic, etcetera.
 */