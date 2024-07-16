package com.chainsys.skillmatrix;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//    	3.Your task is to sort the array in non-decreasing order and print out the original indices of the new sorted array.
//    	Example:
//    	A={4,5,3,7,1}
//    	After sorting the new array becomes A={1,3,4,5,7}.
//    	The required output should be "4 2 0 1 3"   

		System.out.print("Enter the number of elements in the array: ");
		int number = sc.nextInt();
		int[] array = new int[number];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}

		int[] originalArray = Arrays.copyOf(array, number);

		Arrays.sort(array);

		System.out.println("Sorted array: " + Arrays.toString(array));

		System.out.print("Original indices of sorted array: ");
		for (int i = 0; i < number; i++) {
			for (int index = 0; index < number; index++) {
				if (array[i] == originalArray[index]) {
					System.out.print(index + " ");
					break;
				}
			}
		}
	}
}
