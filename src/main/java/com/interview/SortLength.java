package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLength {

	public static void main(String[] args) {
		/// Using java8
		List<String> list = new ArrayList<>(Arrays.asList("aseew", "ax", "wer", "s", "a", "xa"));
		System.out.println(list);
		list.sort((a, b) -> Integer.compare(a.length(), b.length()));
		System.out.println(list);

		// using before java8
		List<String> books = new ArrayList<>(Arrays.asList("Effective Java", "Algorithms", "Refactoring"));
		System.out.println("Sorting List of String by length in JDK 7 ======");
		System.out.println("The original list without sorting");
		System.out.println(books);

		Comparator<String> byLength = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};

		Collections.sort(books, byLength);
		System.out.println("The same list after sorting string by length");
		System.out.println(books);
	}

}
