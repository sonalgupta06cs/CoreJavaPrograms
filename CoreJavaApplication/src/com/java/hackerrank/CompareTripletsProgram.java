package com.java.hackerrank;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CompareTripletsProgram {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> list1, List<Integer> list2) {

		int[] arr1 = list1.stream().mapToInt(Integer::intValue).toArray();
		int[] arr2 = list2.stream().mapToInt(Integer::intValue).toArray();

		int alicePoints = 0, bobPoints = 0;

		List<Integer> returnList = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] > arr2[i]) {

				++alicePoints;

			} else if (arr1[i] == arr2[i]) {

			} else if (arr1[i] < arr2[i]) {

				++bobPoints;

			} else {

			}
		}

		returnList.add(alicePoints);
		returnList.add(bobPoints);

		return returnList;

	}

	public static void main(String[] args) throws IOException {

		/*
		 * List<Integer> a = Arrays.asList(5,6,7); List<Integer> b =
		 * Arrays.asList(3,6,10);
		 */

		List<Integer> a = Arrays.asList(17, 28, 30);
		List<Integer> b = Arrays.asList(99, 16, 8);

		List<Integer> result = compareTriplets(a, b);

		result.forEach(i -> System.out.print(i + " "));

		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ")) .map(Integer::parseInt) .collect(toList());
		 * 
		 * List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ")) .map(Integer::parseInt) .collect(toList());
		 * 
		 * List<Integer> result = compareTriplets(a, b);
		 * 
		 * bufferedWriter.write( result.stream() .map(Object::toString)
		 * .collect(joining(" ")) + "\n" );
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */

	}
}

/*
 * Complete the function compareTriplets in the editor below. It must return an
 * array of two integers, the first being Alice's score and the second being
 * Bob's.
 * 
 * compareTriplets has the following parameter(s):
 * 
 * a: an array of integers representing Alice's challenge rating b: an array of
 * integers representing Bob's challenge rating Input Format
 * 
 * The first line contains space-separated integers, , , and , describing the
 * respective values in triplet . The second line contains space-separated
 * integers, , , and , describing the respective values in triplet .
 * 
 * Constraints
 * 
 * Output Format
 * 
 * Return an array of two integers denoting the respective comparison points
 * earned by Alice and Bob.
 * 
 * Sample Input 0
   5 6 7 3 6 10 
  
 * Sample Output 0
   1 1
 */
