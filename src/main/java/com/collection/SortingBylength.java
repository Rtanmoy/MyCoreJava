package com.collection;

import java.util.TreeSet;

public class SortingBylength {

	public static void main(String[] args) {
		TreeSet<String>set=new TreeSet<>(new MyComparator());
		set.add("A");
		//set.add(new StringBuffer("AA"));
		//set.add(new StringBuffer("ABC")); 
		set.add("AA");
		set.add("AAA");
		System.out.println(set);

	}

}

	

