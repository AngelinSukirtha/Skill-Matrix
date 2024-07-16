package com.chainsys.skillmatrix;

import java.util.Scanner;

public class LengthOfLastWord {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		6. a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//				If the last word does not exist, return 0.
//				Note: A word is defined as a character sequence consists of non-space characters only.
//				Example:
//				Input: "Hello World"
//				Output: 5
		
		System.out.println("Enter the words");
		String s = sc.next();

		s = s.trim();

		int length = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				length++;
			} else {
				break;
			}
		}

		System.out.println("Length of the last word is: " + length);
	}

}
