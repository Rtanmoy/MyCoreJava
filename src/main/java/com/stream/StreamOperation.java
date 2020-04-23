package com.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamOperation {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		// filter()==intermediate operation
		memberNames.stream().filter(p -> p.startsWith("A")).forEach(System.out::println);
		System.out.println("===========================");
		memberNames.parallelStream().filter(p -> p.startsWith("S")).forEach(System.out::println);
		System.out.println("===========================");
		// map()==using one type to other type
		memberNames.stream().filter(p -> p.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		// sort()==sorting arrangement
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
        //anyMatch(),allMatch(),noneMatch()
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);
		//count()
		long totalMatched= memberNames.stream().filter((s) -> s.startsWith("A")).count();
		System.out.println(totalMatched);
		//reduce()
		
	}
}
