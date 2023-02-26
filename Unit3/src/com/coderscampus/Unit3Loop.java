package com.coderscampus;

import java.util.Scanner;

public class Unit3Loop {

	public static void main(String[] args) {
		Integer userInput = getNumberInput();
		System.out.println("The number you typed in was: " + userInput);
	}

	public static Integer getNumberInput() {
		Integer convertedInput = null;

		try (Scanner scanner = new Scanner(System.in)) {
			while (convertedInput == null) {
				System.out.println("Type a number between 50 and 300");
				String input = scanner.nextLine();
				int parsedInput = Integer.parseInt(input);

				if (parsedInput >= 50 && parsedInput <= 300) {
					convertedInput = parsedInput;
				} else {
					System.out.println("Invalid input. Please enter a valid number.");
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid number.");
			e.printStackTrace();
		}

		return convertedInput;
	}
}
