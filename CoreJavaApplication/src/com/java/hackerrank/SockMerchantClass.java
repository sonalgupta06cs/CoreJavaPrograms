package com.java.hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SockMerchantClass {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		int pairs = 0, totalpairs = 0;

		map.forEach((k, v) -> System.out.println(k + " " + v));

		for (Map.Entry<Integer, Integer> entryMap : map.entrySet()) {

			pairs = entryMap.getValue() / 2;
			System.out.println("key " + entryMap.getKey() + " , " + pairs);

			totalpairs += pairs;

		}

		return totalpairs;

	}

	public static void main(String[] args) throws IOException {

		int[] ar = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int n = 9;

		int result = sockMerchant(n, ar);
		System.out.println("No. of pairs " + result);
	}
}

/*
 * Function Description
 * 
 * Complete the sockMerchant function in the editor below. It must return an
 * integer representing the number of matching pairs of socks that are
 * available.
 * 
 * sockMerchant has the following parameter(s):
 * 
 * Output Format
 * 
 * Return the total number of matching pairs of socks that John can sell.
 * 
 * Sample Input
   9 10 20 20 10 10 30 50 10 20 
   
   Sample Output
   3
   
   n: the number of socks in the pile 
   ar: the colors of each sock
 */
