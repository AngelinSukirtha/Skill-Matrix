package com.chainsys.todo;

import java.util.Scanner;

public class MyClass {
//	Create a class called Employee with the below attributes:
//
//		employeeld - int
//		name - String
//		branch - String
//		rating - double
//		company Transport - boolean
//		The above attributes should be private. write getters, setters and parameterized constructor as required.
//
//		Create class MyClass with main method.
//		Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
//		in MyClass class.
//
//		findCountOfEmployeesUsingCompTransport method:
//		----------------------------------------------
//		This method will take an array of Employee object and a String parameter as input parameters.
//		This method will calculate and return the count of Employees who are all using company transport
//		in the given branch (String parameter passed).
//		If no Employee in the given branch using company transport in the array of Employee objects, then
//		the method should return 0.
//
//		findEmployeeWithSecondHighestRating method:
//		--------------------------------------------
//		This method will take an array of Employee objects as an input parameter. This method will return
//		the object of the second highest rating employee from the array of Employee objects who are not using
//		company transport.
//		If all Employees using company transport in the array of Employee objects, then the method should return null.
//
//		Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee
//		is unique.
//		For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it
//		is if the returned value is greater than 0, else it should print "No such Employees".
//		Ex: 2 , where 2 is the count
//		For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from
//		the returned object if the returned value is not null. If the returned value is null, then it should
//		print "All Employees using company transport".
//		Ex: 1003
//		    Uma
//		where 1003 is the employeeld and Uma is the name.
//		Before calling these static methods in main, use Scanner object to read the values of four Employee
//		objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
//		parameter for capturing branch.
//
//		Input :
//
//		1001
//		Ashwa
//		IT
//		5
//		true
//		1002
//		Preeti
//		IT
//		4
//		true
//		1003
//		Uma
//		Admin
//		3
//		false
//		1004
//		Akash
//		Hardware
//		4.5
//		false
//		IT
//
//
//
//		Output :
//
//		2
//		1003
//		Uma
//
//

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number of employee");
		int number = sc.nextInt();
		Employee[] employees = new Employee[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter your employee id:");
			int employeeId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your name:");
			String name = sc.nextLine();
			System.out.println("Enter your branch");
			String branch = sc.nextLine();
			System.out.println("Enter your ratings");
			double rating = sc.nextDouble();
			System.out.println("Are you using company transport[true or false]");
			boolean companyTransport = sc.nextBoolean();

			employees[i] = new Employee(employeeId, name, branch, rating, companyTransport);
		}

		sc.nextLine();
		System.out.println("Enter the branch to search:");
		String branchToSearch = sc.nextLine();
		int count = findCountOfEmployeesUsingCompTransport(employees, branchToSearch);
		if (count > 0) {
			System.out.println(count);
		} else {
			System.out.println("No such Employees");
		}

		Employee secondHighest = findEmployeeWithSecondHighestRating(employees);
		if (secondHighest != null) {
			System.out.println(secondHighest.getEmployeeId());
			System.out.println(secondHighest.getName());
		} else {
			System.out.println("All Employees using company transport");
		}
	}

	public static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branch) {
		int count = 0;
		for (Employee emp : employees) {
			if (emp.getBranch().equals(branch) && emp.isCompanyTransport()) {
				count++;
			}
		}
		return count;
	}

	public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
		Employee highest = null;
		Employee secondHighest = null;
		for (Employee emp : employees) {
			if (!emp.isCompanyTransport()) {
				if (highest == null || emp.getRating() > highest.getRating()) {
					secondHighest = highest;
					highest = emp;
				} else if (secondHighest == null || emp.getRating() > secondHighest.getRating()) {
					secondHighest = emp;
				}
			}
		}
		return secondHighest;
	}
}
