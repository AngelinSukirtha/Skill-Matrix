package com.chainsys.skillmatrix;

import java.util.Scanner;

public class RemoveDuplicates {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		5. Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//				Ex 1: Given nums = [1,1,2],
//				Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//				It doesn't matter what you leave beyond the returned length.
//
//				Ex 2: Given nums = [0,0,1,1,1,2,2,3,3,4],
//				Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
//				It doesn't matter what values are set beyond the returned length.
		System.out.print("Enter the number of elements in the array: ");
		int number = sc.nextInt();
		int[] array = new int[number];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}

		if (array.length == 0) {
			System.out.println("New length: 0");
			System.out.println("Array after removing duplicates: []");
			return;
		}

		int uniqueIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[uniqueIndex]) {
				uniqueIndex++;
				array[uniqueIndex] = array[i];
			}
		}

		int newLength = uniqueIndex + 1;

		System.out.println("New length: " + newLength);
		System.out.print("Array after removing duplicates: ");
		System.out.print("[");
		for (int i = 0; i < newLength; i++) {
			System.out.print(array[i]);
			if (i < newLength - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
