package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		//map take each element of given stream ant process it
		List<String>list=Arrays.asList("good morning","good evening","good night");
		list.stream().map(e->e.toUpperCase()).forEach(System.out::println);
		
		//Stream<String[] ->Stream<String>
		List<String>map=list.stream().map(s->s.split(""))
				            .flatMap(Arrays::stream).distinct()
				            .collect(Collectors.toList());
		map.forEach(System.out::print);

	}

}
