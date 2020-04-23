package com.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysSort {

	public static void main(String[] args) {

		int[]a= {9,2,4,3,6,1};
		for(int a1:a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		for(int a1:a) {
			System.out.println(a1);
		}
		
		String[]s= {"A","B","C"};
		List l=Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1, "W");
		for(String s1:s)
		System.out.println(s1);
		
		l.add("WIfe");
		
	}

}
