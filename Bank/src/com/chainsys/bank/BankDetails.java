package com.chainsys.bank;

public abstract class BankDetails {
	String name;
	long accountNumber;
	String branch;

	public BankDetails(String name, long accountNumber, String branch) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.branch = branch;
	}
	
}
