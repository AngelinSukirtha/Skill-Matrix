package com.chainsys.skillmatrix;

import java.util.Scanner;

public class DivideByGCD {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		9. Take input an array, then divide the whole array by there gcd. 
//		 * Input-1
//		 * ----------
//		 * 5
//		 * 36 12 9 48 15
//		 * 
//		 * Output-1
//		 * ----------
//		 * 12 4 3 16 5
//		 *
//		 * Input-2
//		 * ----------
//		 * 5
//		 * 31 51 47 63 24
//		 *
//		 * Output-2
//		 * ----------
//		 * 31 51 47 63 24

		System.out.println("Enter the number of elements in the array:");
		int number = sc.nextInt();
		int[] array = new int[number];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}

		int gcd = array[0];
		for (int i = 1; i < number; i++) {
			gcd = gcd(gcd, array[i]);
		}

		System.out.println("Array after dividing by GCD:");
		for (int i = 0; i < number; i++) {
			array[i] = array[i] / gcd;
			System.out.print(array[i] + " ");
		}

	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
