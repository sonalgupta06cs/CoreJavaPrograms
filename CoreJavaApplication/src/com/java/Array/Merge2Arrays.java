package com.java.Array;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



class Result {

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
    	
    	int aLen = array1.length;
    	int bLen = array2.length;
    	
    	int[] result = new int[aLen + bLen];
    	
    	 // Merge two sorted arrays into res[] 
        int i = 0, j = 0, k = 0; 
        while (i < n && j < m) { 
            if (a[i] <= b[j]) { 
                res[k] = a[i]; 
                i += 1; 
                k += 1; 
            } else { 
                res[k] = b[j]; 
                j += 1; 
                k += 1; 
            } 
        }     
          
        while (i < n) {  // Merging remaining 
                         // elements of a[] (if any) 
            res[k] = a[i]; 
            i += 1; 
            k += 1; 
        }     
        while (j < m) {   // Merging remaining 
                         // elements of b[] (if any) 
            res[k] = b[j]; 
            j += 1; 
            k += 1; 
        } 
        
        List<Integer> list = Arrays.stream(result).boxed().collect(Collectors.toList());
        
        return list;

    }

}

public class Merge2Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < aCount; i++) {
            int aItem = Integer.parseInt(bufferedReader.readLine().trim());
            a.add(aItem);
        }

        int bCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < bCount; i++) {
            int bItem = Integer.parseInt(bufferedReader.readLine().trim());
            b.add(bItem);
        }

        List<Integer> result = Result.mergeArrays(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
