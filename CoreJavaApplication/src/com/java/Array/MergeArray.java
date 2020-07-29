package com.java.Array;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class ResultMain {

    /*
     * Complete the 'mergeArrays' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
    // Write your code here
        int[] array1 = a.stream().mapToInt(i->i).toArray();
        int[] array2 = b.stream().mapToInt(i->i).toArray();
        
        int n = array1.length;
        int m = array2.length;
        
        int[] res = new int[n + m];

        // Sorting a[] and b[] 
        Arrays.sort(array1); 
        Arrays.sort(array2);

         // Merge two sorted arrays into res[] 
        int i = 0, j = 0, k = 0; 
        while (i < n && j < m) { 
            if (array1[i] <= array2[j]) { 
                res[k] = array1[i]; 
                i += 1; 
                k += 1; 
            } else { 
                res[k] = array2[j]; 
                j += 1; 
                k += 1; 
            } 
        }     
          
        while (i < n) {  // Merging remaining 
                         // elements of a[] (if any) 
            res[k] = array1[i]; 
            i += 1; 
            k += 1; 
        }     
        while (j < m) {   // Merging remaining 
                         // elements of b[] (if any) 
            res[k] = array2[j]; 
            j += 1; 
            k += 1; 
        } 
        
        //System.out.println(Arrays.toString(result));
        
        List<Integer> list = Arrays.stream(res).boxed().collect(Collectors.toList());
        
        return list;

    }

}

public class MergeArray {
	
	public static void main(String[] args) {
		
	}
	
}