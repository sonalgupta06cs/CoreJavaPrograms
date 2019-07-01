package com.java.Array;

/*
 *  Having a good previous year, Monk is back to teach algorithms and data structures.
 *  This year he welcomes the learners with a problem which he calls "Welcome Problem".
 *  The problem gives you two arrays A and B (each array of size N) and asks to print 
 *  new array C such that:
 
	Now, Monk will proceed further when you solve this one. So, go on and solve it :)
	
	Input:
	First line consists of an integer N, denoting the size of A and B.
	Next line consists of N space separated integers denoting the array A.
	Next line consists of N space separated integers denoting the array B.
	
	Output:
	Print N space separated integers denoting the array C.
	
	Input Constraints:
	
	
	O/P;-
	
	SAMPLE INPUT :-
	5
	1 2 3 4 5
	4 5 3 2 10
	
	SAMPLE OUTPUT :-
	5 7 6 6 15 
	
* */
public class MonkWelcomeProblem {

	public static void main(String[] args) {
		
		int A[] = new int[] {8, 10, 2, 10, 8, 5, 6, 9, 3, 1};
		int B[] = new int[] {7, 2, 7, 7, 1, 6, 6, 1, 9, 6};
		int C[] = new int[A.length] ;
	    
		for(int i=0; i<A.length; i++) {
			C[i] = A[i] + B[i];
		}
		
		for(int j=0;j<C.length;j++) {
		   System.out.print(C[j]+" ");
		}
		
		/*for(int k=0;k<C.length;k++) {
			C[k] = 0;
		}*/

	}

}
