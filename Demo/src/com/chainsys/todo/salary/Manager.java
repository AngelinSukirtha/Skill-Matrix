package com.chainsys.todo.salary;

public class Manager extends Member {
	String department;

	public Manager(String name, int age, long phoneNumber, String address, double salary, String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}

}
