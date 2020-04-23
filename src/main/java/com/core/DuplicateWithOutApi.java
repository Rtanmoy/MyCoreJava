package com.core;

import java.util.Arrays;

public class DuplicateWithOutApi {
	static void removeDuplicate(int[] arrayWithDuplicates) {
		System.out.println("Array with duplicates :: ");
		for (int i = 0; i < arrayWithDuplicates.length; i++) {
			System.out.println(arrayWithDuplicates[i] + "\t");
		}
		int noOfUniqueElements = arrayWithDuplicates.length;

		// Comparing each element with all other elements

		for (int i = 0; i < noOfUniqueElements; i++) {
			for (int j = i + 1; j < noOfUniqueElements; j++) {
				// If any two elements are found equal

				if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
					// Replace duplicate element with last unique element

					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements - 1];

					// Decrementing noOfUniqueElements

					noOfUniqueElements--;

					// Decrementing j

					j--;
				}
			}
		}

		// Copying only unique elements of arrayWithDuplicates into
		// arrayWithoutDuplicates

		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);

		// Printing arrayWithoutDuplicates

		System.out.println();

		System.out.println("Array Without Duplicates : ");

		for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
			System.out.print(arrayWithoutDuplicates[i] + "\t");
		}

		System.out.println();

		System.out.println("==============================");
	}

	public static void main(String[] args) {
		removeDuplicate(new int[] { 4, 3, 2, 4, 9, 2 });

		removeDuplicate(new int[] { 1, 2, 1, 2, 1, 2 });

		removeDuplicate(new int[] { 15, 21, 11, 21, 51, 21, 11 });

		removeDuplicate(new int[] { 7, 3, 21, 7, 34, 18, 3, 21 });
	}

}
