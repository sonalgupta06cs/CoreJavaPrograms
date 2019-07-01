package com.java.programsgotfromVinay;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Java provides three ways to generate random numbers using some built-in methods and classes as listed below:

	java.util.Random class
	Math.random method : Can Generate Random Numbers of double type.
	ThreadLocalRandom class
 * */
public class CreateRandomValueInJava {

	public static void main(String[] args) {

		// 1) java.util.Random
		createRandomNoUsingRandomClass();

		System.out.println("Math.random()");
		// 2) Math.random()
		createRandomNoUsingMathClass();

		System.out.println("ThreadLocalRandom");
		// 3) java.util.concurrent.ThreadLocalRandom class
		createRandomNoUsingThreadLocalRandomClass();

	}

	/**
	 * 3) java.util.concurrent.ThreadLocalRandom class 
	 * A random number generator isolated to the current thread.
	 * When applicable, use of ThreadLocalRandom rather than shared
	 * Random objects in concurrent programs will typically encounter
	 * much less overhead and contention. 
	 * Use of ThreadLocalRandom is particularly appropriate when multiple tasks
	 * (for example, each a ForkJoinTask) use random numbers in parallel in thread pools. 
	 * 
	 * This class is introduced in
	 * java 1.7 to generate random numbers of type integers, doubles, booleans etc.
	 * Below program explains how to use this class to generate random numbers:
	 */
	private static void createRandomNoUsingThreadLocalRandomClass() {
		
		 // Generate random integers in range 0 to 999 
        int rand_int1 = ThreadLocalRandom.current().nextInt(); 
        int rand_int2 = ThreadLocalRandom.current().nextInt(); 
  
        // Print random integers 
        System.out.println("Random Integers: " + rand_int1); 
        System.out.println("Random Integers: " + rand_int2); 
  
        // Generate Random doubles 
        double rand_dub1 = ThreadLocalRandom.current().nextDouble(); 
        double rand_dub2 = ThreadLocalRandom.current().nextDouble(); 
  
        // Print random doubles 
        System.out.println("Random Doubles: " + rand_dub1); 
        System.out.println("Random Doubles: " + rand_dub2); 
  
        // Generate random booleans 
        boolean rand_bool1 = ThreadLocalRandom.current().nextBoolean(); 
        boolean rand_bool2 = ThreadLocalRandom.current().nextBoolean(); 
  
        // Print random Booleans 
        System.out.println("Random Booleans: " + rand_bool1); 
        System.out.println("Random Booleans: " + rand_bool2); 
    }  

	/**
	 * 2) Math.random() class 
	 * The class Math contains various methods for performing
	 * various numeric operations such as, calculating exponentiation, logarithms
	 * etc. One of these methods is random(), this method returns a double value
	 * with a positive sign, greater than or equal to 0.0 and less than 1.0. This
	 * method can only generate random numbers of type Doubles.
	 */
	private static void createRandomNoUsingMathClass() {

		// Generating random doubles
		System.out.println("Random doubles: " + Math.random());
		System.out.println("Random doubles: " + Math.random());

	}

	/**
	 * 1) java.util.Random class
	 */
	private static void createRandomNoUsingRandomClass() {

		Random random = new Random();
		int randomInt1 = random.nextInt(1000);
		int randomInt2 = random.nextInt(1000);

		System.out.println("randomInt1 " + randomInt1);
		System.out.println("randomInt2 " + randomInt2);

		boolean randomBoolean1 = random.nextBoolean();
		boolean randomBoolean2 = random.nextBoolean();

		System.out.println("randomBoolean1 " + randomBoolean1);
		System.out.println("randomBoolean2 " + randomBoolean2);
	}

}
