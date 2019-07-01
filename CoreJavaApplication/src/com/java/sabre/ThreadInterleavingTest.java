package com.java.sabre;

public class ThreadInterleavingTest {
	static int counter = 0;

	public static void main(String[] args) {
		Thread one = new Thread(new Task());
		one.setName("one");
		Thread two = new Thread(new Task());
		two.setName("two");
		one.start();
		two.start();
		System.out.println("main completed, counter = " + counter);
	}

	private static class Task implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				counter++;
			}
		}
	}
}