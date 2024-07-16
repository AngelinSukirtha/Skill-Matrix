package com.chainsys.skillmatrix;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculatingWeeks {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		7. Getting the number of weeks between two dates:
//			Let’s assume that we have a date-time range given as two Date or as two LocalDateTime.
//			Write an application that returns the number of weeks contained in this range.

		System.out.println("Enter the start date and time (yyyy-MM-dd HH:mm:ss):");
		String startDateTime = sc.nextLine();

		System.out.println("Enter the end date and time (yyyy-MM-dd HH:mm:ss):");
		String endDateTime = sc.nextLine();

		LocalDateTime startDate = parseDateTime(startDateTime);
		LocalDateTime endDate = parseDateTime(endDateTime);

		if (startDate != null && endDate != null) {
			long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
			System.out.println("Number of weeks between the dates are: " + weeks);
		} else {
			System.out.println("Invalid date-time");
		}
	}

	public static LocalDateTime parseDateTime(String dateTimeStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return LocalDateTime.parse(dateTimeStr, formatter);
	}

}
