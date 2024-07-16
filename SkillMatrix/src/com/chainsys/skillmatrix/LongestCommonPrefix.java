package com.chainsys.skillmatrix;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
//		8. Write a program to find the longest common prefix among an array of strings. 
//		The longest common prefix is the string thatall strings in the array have in common as a prefix.
//
//		For example, given the array of strings ["flower", "flow", "flight"],
//		the program should return the string "fl" as it is the
//		longest common prefix among all the strings.
//
//		Write a program that takes an array of strings as input and 
//		returns the longest common prefix among them. 

		String[] array = { "flower", "flow", "flight" };

		Arrays.sort(array);

		String first = array[0];
		String last = array[array.length - 1];
		int minLength = Math.min(first.length(), last.length());
		int i = 0;
		while (i < minLength && first.charAt(i) == last.charAt(i)) {
			i++;
		}

		String longestCommonPrefix = first.substring(0, i);
		System.out.println("Longest common prefix: " + longestCommonPrefix);
	}

}

