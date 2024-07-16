package com.chainsys.todo;

public class BankImpl implements Bank {
	private double balance;

	public BankImpl(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
}
