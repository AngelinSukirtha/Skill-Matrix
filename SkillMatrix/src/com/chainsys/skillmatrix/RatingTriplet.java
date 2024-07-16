package com.chainsys.skillmatrix;

import java.util.Scanner;

public class RatingTriplet {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		2. We define the rating for Alice's challenge to be the triplet a = (a[0],a[1],a[2]), and the rating for Bob's challenge to be the triplet b = (b[0],b[1],b[2]).
//				Your task is to find their comparison points by comparing a[i] with b[i]
//				if a[i] > b[i] - alice is awarded 1 point
//				if a[i] < b[i] - bob is awarded 1 point
//				if a[i] = b[i] - then neither person receives a point.
//				
//				Sample Input
//				5 6 7
//				3 6 10
//				Sample Output
//				1 1
//
//				Sample Input
//				17 28 30
//				99 16 8
//				Sample Output
//				2 1

		int[] a = new int[3];

		System.out.println("Enter Alice's rating:");
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}

		int[] b = new int[3];

		System.out.println("Enter Bob's rating:");
		for (int i = 0; i < 3; i++) {
			b[i] = sc.nextInt();
		}

		int alicePoints = 0;
		int bobPoints = 0;

		for (int i = 0; i < 3; i++) {
			if (a[i] > b[i]) {
				alicePoints++;
			} else if (a[i] < b[i]) {
				bobPoints++;
			} else {
				System.out.println("Neither person receives a point");
				break;
			}
		}
		System.out.println("alicePoints is:" + alicePoints);
		System.out.println("bobPoints is:" + bobPoints);
	}

}
