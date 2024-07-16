package com.chainsys.todo.salary;

public class Member {

//		Create a class named 'Member' having the following members:
//		Data members
//		1 - Name
//		2 - Age
//		3 - Phone number
//		4 - Address
//		5 - Salary
//		It also has a method named 'printSalary' which prints the salary of the members.
//		Two classes 'Employee' and 'Manager' inherits the 'Member' class.
//		The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
//		Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

	String name;
	int age;
	long phoneNumber;
	String address;
	double salary;

	public Member(String name, int age, long phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}

	public void printSalary() {
		System.out.println("Salary: " + salary);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Rithiga", 26, 9254567890L, "Kalavasal, Madurai", 25000, "ECE");
		Manager manager = new Manager("Daniel", 35, 9876543210L, "Egmore, Chennai", 100000, "HR");

		System.out.println("Employee Details");
		System.out.println("Name: " + employee.name);
		System.out.println("Age: " + employee.age);
		System.out.println("Phone Number: " + employee.phoneNumber);
		System.out.println("Address: " + employee.address);
		employee.printSalary();
		System.out.println("Specialization: " + employee.specialization);
		System.out.println();

		System.out.println("Manager Details");
		System.out.println("Name: " + manager.name);
		System.out.println("Age: " + manager.age);
		System.out.println("Phone Number: " + manager.phoneNumber);
		System.out.println("Address: " + manager.address);
		manager.printSalary();
		System.out.println("Department: " + manager.department);
	}
}
