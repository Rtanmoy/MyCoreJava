package com.core;

import java.util.Scanner;

public class ConsecutiveLetters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String s = scanner.nextLine();
		int result = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			char currentChar = s.charAt(i);
			char nextChar = s.charAt(i + 1);
			if (nextChar == currentChar + 1) {
				result++;
			}
		}
		System.out.println("Number of consecutive characters are " + result);
	}
}