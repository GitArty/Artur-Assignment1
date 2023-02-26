package com.coderscampus;

import java.util.Scanner;

public class Unit3Method {

	public static void main(String[] args) {
		Integer userInput = getNumberInput();
		System.out.println("The number you typed in was: " + userInput);
	}

	public static Integer getNumberInput() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Type a number between 50 and 300");
			String input = scanner.nextLine();
			int convertedInput = Integer.parseInt(input);

			if (convertedInput >= 50 && convertedInput <= 300) {
				return convertedInput;
			} else {
				return null;
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid number.");
			e.printStackTrace();
			return null;
		}
	}
}