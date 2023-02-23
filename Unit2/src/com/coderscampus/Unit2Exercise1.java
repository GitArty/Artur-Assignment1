package com.coderscampus;

import java.util.Scanner;

public class Unit2Exercise1 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter a number: ");
			String input = scanner.nextLine();
			int convertedInput = Integer.parseInt(input);

			if (convertedInput >= 50 && convertedInput <= 300) {
				System.out.println("Yes!");
			} else {
				System.out.println("No!");
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid number.");
			e.printStackTrace();
		}
	}
}