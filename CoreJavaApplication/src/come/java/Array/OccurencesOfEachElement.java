package come.java.Array;

import java.util.Scanner;

/*
 * In this Game , your team will be shown N numbers for few minutes . You will have to memorize these numbers.

	Now, the questioner will ask you Q queries, in each query He will give you a number , and you have to tell him the total number of occurrences of that number in the array of numbers shown to your team . If the number is not present , then you will have to say “NOT PRESENT” (without quotes).
	
	INPUT And OUTPUT
	
	The first line of input will contain N, an integer, which is the total number of numbers shown to your team.
	
	The second line of input contains N space separated integers .
	
	The third line of input contains an integer Q , denoting the total number of integers.
	
	The Next Q lines will contain an integer denoting an integer,  , for which you have to print the number of occurrences of that number () in those N numbers on a new line.
	
	If the number  isn’t present then Print “NOT PRESENT” (without quotes) on a new line.
	
	SAMPLE INPUT:- 
	6
	1 1 1 2 2 0
	6
	1
	2
	1
	0
	3
	4
	
	SAMPLE OUTPUT:- 
	3
	2
	3
	1
	NOT PRESENT
	NOT PRESENT

	
 * */
public class OccurencesOfEachElement {

	public static void main(String[] args) {
		
		int A[] = new int[] {1,1,1,2,2,0};
		
		Scanner s = new Scanner(System.in);

		// Get number to look the occurence for from the input
		int query = s.nextInt();
		int occurence = 0;
		int foundElement[] = new int[1];
		
		for(int i=0;i<A.length;i++) {
			
			if(A[i] == query) {
			   
			   foundElement[0] = A[i];
			   occurence++;
				
			}
			
		}
		if(occurence != 0)
		System.out.println("occurence for "+"element "+foundElement[0]+" is "+occurence);
		else
		System.out.println("NOT PRESENT");
		
		

	}

}
