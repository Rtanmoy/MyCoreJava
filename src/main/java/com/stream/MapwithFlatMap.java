package com.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapwithFlatMap {
	public static void main(String[] args) {
		// find the distinct words in a file
		Path path = Paths.get("D:\\test.txt");
		Set<String> setOfword = new HashSet<>();
		try {
			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					setOfword.add(word);
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println(setOfword);

		// Using map
		try {
			Files.lines(path).map(e -> e.split("\\s+"))
			                 .flatMap(Arrays::stream).distinct()
			                 .forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
