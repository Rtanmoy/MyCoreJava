package com.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationArraylist {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("for");
		list.add("apple");
		System.out.println(list);
		System.out.println("Using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Using for loop=> " + list.get(i));
		}
		System.out.println("Using advance for loop");
		for (String str : list) {
			System.out.println(str);
		}
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("Using advance while loop");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
