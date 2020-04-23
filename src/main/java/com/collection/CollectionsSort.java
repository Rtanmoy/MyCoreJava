package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
public static void main(String[] args) {
	List<String> al=new ArrayList<String>();
	al.add("Ram");
	al.add("Sam");
	al.add("Quar");
	al.add("Munro");
	//Collections.sort(al);
	Collections.reverse(al);
	//Collections.sort(al, new MyComparator());
	System.out.println(al);
	System.out.println(Collections.binarySearch(al, "Ram"));
	System.out.println(Collections.binarySearch(al, "Quar"));
	
}
}
