package com.collection;

import java.util.TreeSet;

public class SortingTreeSet {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>(new MyComparator());
		treeSet.add("Q");
		treeSet.add("W");
		treeSet.add("F");
		treeSet.add("D");
		treeSet.add("B");
		System.out.println("TreeSet==>> "+treeSet);
	}
}

