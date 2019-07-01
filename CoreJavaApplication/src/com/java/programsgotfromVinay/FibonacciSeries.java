package com.java.programsgotfromVinay;

// 0 1 1 2 3 5 8 13 21 34 55,.....
public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		fibonacciSeries();
		
	}

	private static void fibonacciSeries() {
	
		int temp1 = 0, temp2 = 1, n=10, sum = 0;
				
		/*for(int i=0;i<n;i++) {
		
			System.out.print(temp1+" ");   // 0 1 1 2 3 5
			
			sum = temp1 + temp2; // 5
			temp2 = temp1;   // 2 
			temp1 = sum;     // 5
			
			
		}*/		
		
		// or
		int i = 1;
		while (i<=n)
		{
			System.out.print(temp1+" ");
			sum = temp1 + temp2; 
			temp2 = temp1;    
			temp1 = sum;
			
			i++;
		}	
		
		
		
	}

}
