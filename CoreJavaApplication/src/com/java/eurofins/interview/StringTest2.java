package com.java.eurofins.interview;

/**
 * @author SonaSach
 *
 */
public class StringTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = str1.intern();

		System.out.println(str1 + " : " + str2); // abc abc
		System.out.println(str1 == str2); // false

		String s1 = "abc";
		String s2 = new String("abc");
		s2.intern();
		System.out.println(s1 == s2); // false

		s2 = s2.intern();
		System.out.println(s1 == s2); // true

	}

}

/**
 * It’s a tricky question and output will be false. We know that intern() method
 * will return the String object reference from the string pool, but since we
 * didn’t assigned it back to s2, there is no change in s2 and hence both s1 and
 * s2 are having different reference. If we change the code in line 3 to s2 =
 * s2.intern(); then output will be true.
 */
