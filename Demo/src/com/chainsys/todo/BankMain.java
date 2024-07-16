package com.chainsys.todo;

public class BankMain {

	public static void main(String[] args) {
		BankImpl bankA = new BankImpl(1000);
		BankImpl bankB = new BankImpl(1500);
		BankImpl bankC = new BankImpl(2000);

		System.out.println("Balance in Bank A: $" + bankA.getBalance());
		System.out.println("Balance in Bank B: $" + bankB.getBalance());
		System.out.println("Balance in Bank C: $" + bankC.getBalance());
	}
}