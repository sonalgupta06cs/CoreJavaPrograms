package com.java.practice;
import java.util.Scanner;

/*
    Instructions:

	We have defined an integer variable N for you.
	We have provided the code to get the input for variable N.
	We have defined integer arrays ,  and .
	We have provided the code to get the input for the array elements.
	You have to write the logic to add the array elements.
	Store the sum values in respective elements of variable 
	Print all the elements of  with space between them
	Sample Input:
	N = 3 
	 = 3 9 8
	 = 8 12 74
	
	Sample Output:
	11 21 82
 * */
public class AddTwoArrays {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// Reading integer from input
		int N = s.nextInt();
		
		int[] numArrayA = new int[N];
		int[] numArrayB = new int[N];
		int[] sumArray = new int[N];
				
		// Read numArray1
		for(int i=0; i<N; i++) {
			numArrayA[i] = s.nextInt();
		}
		// Read numArray2
		for(int i=0; i<N; i++) {
			numArrayB[i] = s.nextInt();
		}
		
		// Write your logic here:
		for(int j=0;j<N;j++){
		   
		        sumArray[j] += (numArrayA[j] + numArrayB[j]);
		}
		
	
		// Print the sumArray
		for(int i=0; i<N; i++) {
			System.out.print(sumArray[i] + " ");
		}
        
        System.out.println();
		s.close();

	}

}