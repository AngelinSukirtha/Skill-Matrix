package com.chainsys.bank;

import java.util.Scanner;

public class LongestCommonPrefix {
	static Scanner sc = new Scanner(System.in);

//	public static void main(String[] args) {
//		System.out.println("Enter the number of array");
//		int number = sc.nextInt();
//		String[] array = new String[number];
//		System.out.println("Enter the elements of the array");
//		for (int i = 0; i < number; i++) {
//			array[i] = sc.next();
//		}
//		Arrays.sort(array);
//		String first = array[0];
//		String last = array[array.length - 1];
//		int minLength = Math.min(first.length(), last.length());
//		int j = 0;
//		while (j < minLength && first.charAt(j) == last.charAt(j)) {
//			j++;
//		}
//		String longestCommonPrefix = first.substring(0, j);
//		System.out.println("Longest common prefix is: " + longestCommonPrefix);

//		String longestCommonSubstring = findLongestCommonSubstring(array);
//		System.out.println("Longest common prefix is: " + longestCommonSubstring);
//	}
//
//	public static String findLongestCommonSubstring(String[] array) {
//		if (array == null || array.length == 0) {
//			return "";
//		}
//		String first = array[0];
//		int n = array.length;
//		int minLength = first.length();
//		String longestSubstring = "";
//		for (int start = 0; start < minLength; start++) {
//			for (int end = start + 1; end <= minLength; end++) {
//				String substring = first.substring(start, end);
//				boolean common = true;
//				for (int i = 1; i < n; i++) {
//					if (!array[i].contains(substring)) {
//						common = false;
//						break;
//					}
//				}
//				if (common && substring.length() > longestSubstring.length()) {
//					longestSubstring = substring;
//				}
//			}
//		}
//		return longestSubstring;
//	}
//}

	public static void main(String[] args) {
		System.out.println("Enter the number of array");
		int number = sc.nextInt();
		String[] array = new String[number];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < number; i++) {
			array[i] = sc.next();
		}

		System.out.println("Longest common prefix: " + longestCommonPrefix(array));
	}

	public static String longestCommonPrefix(String[] array) {
		if (array == null || array.length == 0) {
			return "";
		}

		String prefix = array[0];
		for (int i = 1; i < array.length; i++) {
			while (array[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return findLongestCommonPrefix(array);
				}
			}
		}

		return prefix;
	}

	public static String findLongestCommonPrefix(String[] array) {
		String longestPrefix = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				String prefix = array[i];
				while (array[j].indexOf(prefix) != 0) {
					prefix = prefix.substring(0, prefix.length() - 1);
					if (prefix.isEmpty()) {
						break;
					}
				}
				if (prefix.length() > longestPrefix.length()) {
					longestPrefix = prefix;
				}
			}
		}
		return longestPrefix;
	}
}
