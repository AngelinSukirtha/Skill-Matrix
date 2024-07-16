package com.chainsys.skillmatrix;

import java.util.Scanner;

public class FindPreviousNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//			1. Program to print the following
//			SAMPLE INPUT
//			Line 1: 4 3 7 6 7 2 2
//			Lin 2: 7 6
//			SAMPLE OUTPUT
//			3

		System.out.print("Enter the number of elements in the array: ");
		int number = sc.nextInt();
		int[] array = new int[number];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Enter the number to find previous of that number:");
		int findPreviousOfNumber = sc.nextInt();

		int previousNumber = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == findPreviousOfNumber) {

				if (i > 0) {
					previousNumber = array[i - 1];
				} else {
					previousNumber = -1;
				}
				break;
			}
		}

		if (previousNumber != -1) {
			System.out.println("Previous number is: " + previousNumber);
		} else {
			System.out.println("Invalid number");
		}
	}

}
