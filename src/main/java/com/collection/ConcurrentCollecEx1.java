package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentCollecEx1 {

	public static void main(String[] args) {
		List<String>al=new ArrayList<String>();
		al.add("A");
		al.add("Q");
		al.add("W");
		al.add("T");
		System.out.println(al);
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
			al.add("Z");//RE=>java.util.ConcurrentModificationException
		}

	}

}
