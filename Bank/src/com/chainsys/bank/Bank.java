package com.chainsys.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	static String name;
	static long accountNumber;
	static String branch;
	static String ifsc;
	static double existingBalance = 20000;
	static double withdrawal;
	static double deposit;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("Enter your withdrawal amount");
//		withdrawal = sc.nextDouble();
//		existingBalance -= withdrawal;
//
//		if (existingBalance < 0) {
//			System.out.println("You don't have sufficent amount in your balance");
//		} else {
//			System.out.println("Your current Existing Balance is:" + existingBalance);
//		}
//
//		System.out.println("Enter your deposit amount");
//		deposit = sc.nextDouble();
//		existingBalance += deposit;
//		System.out.println("Your current Existing Balance is:" + existingBalance);
//
//		while (true) {
//			System.out.println("Enter your name:");
//			name = sc.next();
//			if (name.matches("[a-zA-Z]{3,}")) {
//				System.out.println("Nice name!!");
//				break;
//			} else {
//				System.out.println("Invalid data");
//			}
//		}
//
//		while (true) {
//			System.out.println("Enter your account number:");
//			accountNumber = sc.nextLong();
//			String accountNumberStr = Long.toString(accountNumber);
//			if (accountNumberStr.matches("\\d{12}")) {
//				System.out.println("Valid account number: " + accountNumber);
//				break;
//			} else {
//				System.out.println("Invalid account number. Please enter exactly 12 digits.");
//			}
//		}
//
//		while (true) {
//			System.out.println("Enter your IFSC:");
//			String ifsc = sc.next();
//			if (ifsc.matches("^[A-Z]{4}0[A-Z0-9]{6}$")) {
//				System.out.println("Valid IFSC: " + ifsc);
//				break;
//			} else {
//				System.out.println("Invalid IFSC.");
//			}
//		}
//
//		while (true) {
//			System.out.println("Enter your branch name:");
//			branch = sc.next();
//			if (branch.matches("[a-zA-Z]{3,}")) {
//				System.out.println("Valid branch: " + branch);
//				break;
//			} else {
//				System.out.println("Invalid data");
//			}
//		}
		ArrayList<String> accountHoldersName = new ArrayList<String>();
		accountHoldersName.add("Sukirtha");
		accountHoldersName.add("Rithiga");
		while (true) {
			System.out.println("Enter your name:");
			name = sc.next();
			if (name.matches("[a-zA-Z]{3,}")) {
				accountHoldersName.add(name);
				System.out.println(accountHoldersName);
				break;
			} else {
				System.out.println("Invalid data");
			}
		}

		ArrayList<String> accountHolders = new ArrayList<String>();
		accountHolders.add("123456789098");
		accountHolders.add("223456789098");
		while (true) {
			System.out.println("Enter your account number:");
			accountNumber = sc.nextLong();
			String accountNumberStr = Long.toString(accountNumber);
			if (accountNumberStr.matches("\\d{12}")) {
				System.out.println("Valid account number: " + accountNumber);
				accountHolders.add(accountNumberStr);
				System.out.println(accountNumberStr);
				break;
			} else {
				System.out.println("Invalid account number. Please enter exactly 12 digits.");
			}
		}

		ArrayList<String> accountHoldersIfsc = new ArrayList<String>();
		accountHoldersIfsc.add("IFSC0AB1234");
		accountHoldersIfsc.add("IFSC0AB1235");
		while (true) {
			System.out.println("Enter your IFSC:");
			String ifsc = sc.next();
			if (ifsc.matches("^[A-Z]{4}0[A-Z0-9]{6}$")) {
				System.out.println("Valid IFSC: " + ifsc);
				accountHoldersIfsc.add(ifsc);
				System.out.println(accountHoldersIfsc);
				break;
			} else {
				System.out.println("Invalid IFSC.");
			}
		}

	}
}
