package com.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		List<String>names=new ArrayList<String>();
		names.add("Raja");
		names.add("Rani");
		names.add("Rya");
		names.add("Sweety");
		names.add("Rahul");
		names.add("Raja");
		names.add("Rya");
		
		names.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
	}

}
