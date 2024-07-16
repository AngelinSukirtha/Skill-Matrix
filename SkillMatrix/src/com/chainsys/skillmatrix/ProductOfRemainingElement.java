package com.chainsys.skillmatrix;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfRemainingElement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		4.Implement a function which, given an array of integers, returns a new array for which every index carries the value of the product of the remaining elements.
//		Example
//		Given array [1, 3, 2, 4, 5] it would return [120, 40, 60,30, 24]
//		Given array [4, 10, 3] it would return [30, 12, 40]

		System.out.print("Enter the number of elements in the array: ");
		int number = sc.nextInt();
		int[] array = new int[number];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}

		int n = array.length;

		int[] result = new int[n];

		int[] left = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * array[i - 1];
		}

		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] = left[i] * right;
			right *= array[i];
		}

		System.out.println("Input array: " + Arrays.toString(array));
		System.out.println("Output array: " + Arrays.toString(result));

	}

}
