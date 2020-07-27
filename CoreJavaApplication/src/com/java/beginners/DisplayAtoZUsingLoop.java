package com.java.beginners;

public class DisplayAtoZUsingLoop {

	public static void main(String[] args) {
		
		for(int c=97;c<=122;c++) {
			System.out.print((char)c+" ");
		}
		
		System.out.println();
		
		for(int c=65;c<=90;c++) {
			System.out.print((char)c+" ");
		}
		
		System.out.println();
		
		for(char c='A';c<='Z';c++) {
			System.out.print(c+" ");
		}

	}

}
