package com.chainsys.bank;

import java.util.Scanner;

public class Company {
//	Create a class named "Company" with the following attributes:
//
//		companyName (String)
//		employees (Employee array)
//		numEmployees (int)
//
//		The above attributes should be private, and the class should have a parameterized constructor to initialize them.
//
//		Implement the following methods in the Company class:
//
//		getAverageSalary(): This method should return the average salary of all the employees in the company.
//		getMaxSalary(): This method should return the highest salary of all the employees in the company.
//		getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.
//
//		In the main method, use a Scanner object to read the values of the company name, number of employees, and the employee details
//		(id, name, designation, and salary) in a loop. Once all employee details have been read, create a Company object and pass the
//		appropriate parameters. Finally, call the three methods mentioned above and print the output.
//
//		Note:
//
//		All searches should be case-insensitive.
//		You may assume that the input is valid and in the correct format.
//
//		Sample input:
//		---------------------
//		Enter company name: ABC Company
//		Enter number of employees: 3
//		Enter employee details:
//		Employee 1:
//		Enter id: 101
//		Enter name: John Smith
//		Enter designation: Manager
//		Enter salary: 5000
//		Employee 2:
//		Enter id: 102
//		Enter name: Jane Doe
//		Enter designation: Engineer
//		Enter salary: 4000
//		Employee 3:
//		Enter id: 103
//		Enter name: Bob Johnson
//		Enter designation: Engineer
//		Enter salary: 4500
//
//		Sample Output:
//		--------------------
//		Average salary: 4500.0
//		Max salary: 5000.0
//		Employees with designation: Engineer
//		ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
//		ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0

	private String companyName;
	private Employee[] employees;
	private int numEmployees;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	static Scanner sc = new Scanner(System.in);

	public Company(String companyName, int numEmployees) {
		this.companyName = companyName;
		this.numEmployees = numEmployees;
		this.employees = new Employee[numEmployees];
	}

	public static void main(String[] args) {
		System.out.print("Enter company name: ");
		String companyName = sc.nextLine();
		System.out.print("Enter number of employees: ");
		int numEmployees = sc.nextInt();
		sc.nextLine();
		Company company = new Company(companyName, numEmployees);

		System.out.println("Enter employee details");
		for (int i = 0; i < numEmployees; i++) {
			System.out.print("Enter id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			System.out.print("Enter designation: ");
			String designation = sc.nextLine();
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();

			Employee employee = new Employee(id, name, designation, salary);
			company.addEmployee(i, employee);
		}

		System.out.println("Average salary: " + company.getAverageSalary());
		System.out.println("Max salary: " + company.getMaxSalary());

		String searchDesignation = "Engineer";
		Employee[] engineers = company.getEmployeesByDesignation(searchDesignation);
		System.out.println("Employees with designation: " + searchDesignation);
		for (Employee emp : engineers) {
			System.out.println(emp);
		}
	}

	public void addEmployee(int index, Employee employee) {
		employees[index] = employee;
	}

	public double getAverageSalary() {
		double totalSalary = 0;
		for (Employee emp : employees) {
			totalSalary = totalSalary + emp.getSalary();
		}
		return totalSalary / numEmployees;
	}

	public double getMaxSalary() {
		double maxSalary = employees[0].getSalary();
		for (int i = 1; i < numEmployees; i++) {
			if (employees[i].getSalary() > maxSalary) {
				maxSalary = employees[i].getSalary();
			}
		}
		return maxSalary;
	}

	public Employee[] getEmployeesByDesignation(String designation) {
		int count = 0;
		for (Employee emp : employees) {
			if (emp.getDesignation().equalsIgnoreCase(designation)) {
				count++;
			}
		}
		Employee[] result = new Employee[count];
		int index = 0;
		for (Employee emp : employees) {
			if (emp.getDesignation().equalsIgnoreCase(designation)) {
				result[index++] = emp;
			}
		}
		return result;
	}
}
