package com.chainsys.todo;

import java.util.Scanner;

public class Staff {
	static String name;
	static int age;
	static String qualification;
	static String collegeName;
	static int attendancePercentage;
	static int experience;
	static int salary;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("Enter your name:");
//		name = sc.next();
//		System.out.println("Enter your age:");
//		age = sc.nextInt();
//		System.out.println("Enter your qualification:");
//		qualification = sc.next();
//		System.out.println("Enter your College Name:");
//		collegeName = sc.next();
		System.out.println("Enter your experience:");
		experience = sc.nextInt();
		if (experience == 0) {
			System.out.println("Fresher");
		} else if (experience < 0) {
			System.out.println("Invalid data");
		} else {
			System.out.println("You have " + experience + "years of experience");
		}
		salaryCalculation();
		designation();
	}

	public static void salaryCalculation() {
		int baseSalary = 200;
		if (experience > 0) {
		int totalSalary = baseSalary * experience;
		System.out.println("Total Salary: " + totalSalary);}
	}

	public static void designation() {
		if (experience > 0) {
			if (experience >= 0 && experience <= 2) {
				System.out.println("Your designation is Assistant Professor");
			} else if (experience >= 2 && experience <= 6) {
				System.out.println("Your designation is Professor");
			} else if (experience >= 6 && experience <= 12) {
				System.out.println("Your designation is HOD");
			} else {
				System.out.println("Your designation is Principal");
			}
		} else {
			System.out.println("Invalid data");
		}
	}
}
