package com.java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest {

	/*
	 * Alice and Bob work in a beautiful orchard. There are N apple trees in the
	 * orchard. The apple trees are arranged in a row and they are numbered from 1
	 * to N. Alice is planning to collect all the apples from K consecutive trees
	 * and Bob is planning to collect all the apples from L consecutive trees. They
	 * want to choose two disjoint segments (one consisting of K trees for Alice and
	 * the other consisting of L trees for Bob) so as not to disturb each other.
	 * What is the maximum number of apples that they can collect? Write a function
	 * that given an array A consisting of N integers denating the number of apples
	 * on each apple tree in the row, and integers K and L denoting, respectively,
	 * thenumber of trees that Alice and Bob can choose when collecting, returns the
	 * maximum number of apples that can be collected by them, or -1 if there are no
	 * such intervals. For example, given A =[6, 1,4,6,3,2,7,4], K=3, L=2, your
	 * function should return 24, because Alice can choose trees 3 to 5 and collect
	 * 4 + 6 + 3 = 13 apples, and Bob can choose trees 7 to 8 and collect 7 + 4 = 11
	 * apples. Thus, they will collect 13 + 11 = 24 apples in total, and that is the
	 * maximum number that can be achieved. Given A = [10, 19, 15], K = 2, L = 2,
	 * your function should return -1, because it is not possible for Alice and Bob
	 * to choose two disjoint intervals. Assume that: N is an integer within the
	 * range [2..600]; K and L are integers within the range [1 .. N-1]; each
	 * element of array A is an integer within the range [1..500] In your solution
	 * focus on correctness. The performance of your solution will not be the focus
	 * of the assessment.
	 */

	public static void function(Integer[] a, int k, int l) {
		int totalOfKAndL = 0;

		Integer[] maxAndStartingIndex = getMaxContiguosFromArray(a, k);
		totalOfKAndL += maxAndStartingIndex[0];
		System.out.println(maxAndStartingIndex[0]);
		Integer[] leadingElements = Arrays.copyOfRange(a, 0, maxAndStartingIndex[1]);
		Integer[] trailingElements = Arrays.copyOfRange(a, (maxAndStartingIndex[1] + k), a.length);

		List<Integer> mergedLeadingAndTrailingElements = new ArrayList(Arrays.asList(leadingElements));
		mergedLeadingAndTrailingElements.addAll(Arrays.asList(trailingElements));
		Integer[] mergedLeadingAndTrailingElementsArray = mergedLeadingAndTrailingElements.toArray(new Integer[0]);

		maxAndStartingIndex = getMaxContiguosFromArray(mergedLeadingAndTrailingElementsArray, l);
		System.out.println(maxAndStartingIndex[0]);
		totalOfKAndL += maxAndStartingIndex[0];
		System.out.println(totalOfKAndL);
	}

	static Integer[] getMaxContiguosFromArray(Integer[] a, int numberOrElements) {
		int sumForFirst = 0;
		int sumForFirstPrev = 0;
		int startingIndexForK = 0;
		Integer[] maxAndStartingIndex = new Integer[2];
		for (int i = 0; i < a.length; i++) {
			if (i <= a.length - numberOrElements) {
				for (int j = i; j < i + numberOrElements; j++) {
					sumForFirst += a[j];
				}
			}

			if (sumForFirst > sumForFirstPrev) {
				sumForFirstPrev = sumForFirst;
				startingIndexForK = i;

			}
			sumForFirst = 0;
		}
		maxAndStartingIndex[0] = sumForFirstPrev;
		maxAndStartingIndex[1] = startingIndexForK;
		return maxAndStartingIndex;
	}

	public static void main(String[] args) {
		Integer a[] = { 6, 1, 3, 4, 5, 6, 8, 2, 7 };

		function(a, 3, 2);

	}
}