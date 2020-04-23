package com.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollecPutIfAbsent {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String>al=new ConcurrentHashMap<>();
		al.put("A", "ABC");
		al.put("B", "BCD");
		al.put("C", "CDE");
		al.put("D", "DEF");
		al.put("E", "EFG");
		System.out.println(al);
		al.putIfAbsent("B", "BVC");//return old associated value
		System.out.println(al);
		System.out.println(al.get("D").equals("DEF"));
		al.remove("D", "DEF");
		System.out.println(al);
		al.remove("E");
		System.out.println(al);
		
		al.replace("C", "CBA");
		System.out.println(al);
		al.replace("C", "CBA", "CDE");
		System.out.println(al);
	
	}

}
