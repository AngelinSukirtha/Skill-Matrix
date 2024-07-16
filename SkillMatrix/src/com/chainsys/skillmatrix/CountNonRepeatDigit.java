package com.chainsys.skillmatrix;

import java.util.Scanner;

public class CountNonRepeatDigit {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		10. Count of Nonrepeat-digited number (10, 12, 13,.............) between a range
//		 * Note:
//		 * Repeat-Digit :- 11, 22, 33, .............
//		 * You should ignore the digit and count the other numbers
//		 *
//		 * Input :
//		 * ---------------------
//		    10
//		    25
//
//		    Output :
//		    -------------------
//		    14

		System.out.println("Enter the start number:");
		int startNumber = sc.nextInt();
		System.out.println("Enter the end number:");
		int endNumber = sc.nextInt();
		int count = 0;

		for (int i = startNumber; i <= endNumber; i++) {
			if (!repeatDigit(i)) {
				count++;
			}
		}
		System.out.println("Count of Nonrepeat-digit numbers is: " + count);
	}

	public static boolean repeatDigit(int num) {
		String number = Integer.toString(num);
		for (int i = 0; i < number.length() - 1; i++) {
			if (number.charAt(i) == number.charAt(i + 1)) {
				return true;
			}
		}
		return false;
	}

}
