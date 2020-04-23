package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStream {

	public static void main(String[] args) {
		System.out.println("=====>>Stream.of(val1, val2, val3….)<<====");
		Stream<Integer> stream = Stream.of(1, 2, 3);
		stream.forEach(p -> System.out.println(p));
		
		System.out.println("=====>>Stream.of(arrayOfElements)<<====");
		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3});
		stream1.forEach(p -> System.out.println(p));
		System.out.println("=====>>List.stream()<<====");
		List<Integer>list=new ArrayList<>();
		for(int i=1;i<5;i++) {
			list.add(i);
		}
		Stream<Integer>stream2=list.stream();
		stream2.forEach(p -> System.out.println(p));
		System.out.println("=====>>String chars or String tokens<<====");
		IntStream stream3 = "12345_abcdefg".chars();
        stream3.forEach(p -> System.out.println(p));
		
		Stream<String> stream4 = Stream.of("A$B$C".split("\\$"));
        stream4.forEach(p -> System.out.println(p));
	}

}
