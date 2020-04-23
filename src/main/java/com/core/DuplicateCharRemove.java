package com.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharRemove {

	public static void main(String[] args) {
	String str="Importance of core java";
	String output=removeDupes(str);
	System.out.println("Output===>>"+output);
	
	String withOutDupes=removeDupsInPlace(str);
	System.out.println("withOutDupes==>>"+withOutDupes);
	//Using linked hashset
	ArrayList<Integer>numList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,25,3,7));
	System.out.println("NumList==>>"+numList);
	LinkedHashSet<Integer>hashSet=new LinkedHashSet<>(numList);
	ArrayList<Integer>list=new ArrayList<>(hashSet);
	System.out.println("List==>"+list);
	//using stream api
	List<Integer>list1=numList.stream().distinct().collect(Collectors.toList());
	System.out.println("LIST1=-=>"+list1);
	}

	private static String removeDupsInPlace(String str) {
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			String ch=str.substring(i, i+1);
			if(builder.indexOf(ch)<0) {
				builder.append(ch);
			}
		}
		return builder.toString();
	}

	private static String removeDupes(String str) {
		Set<Character>chars=new HashSet<>();
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(chars.add(ch)) {
				builder.append(ch);
			}
		}
		return builder.toString();
	}

}
