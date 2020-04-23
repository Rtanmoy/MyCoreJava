package com.core;

import java.util.ArrayList;
import java.util.List;

public class DuplicateArrayList {
public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		
		 list.add("virat");		list.add("Rohit");		list.add("Jasprit");		list.add("Dhawan");
		list.add("Ayyar");	list.add("Dhawan");	list.add("virat");			list.add("Rohit");
		list.add("rahul");		list.add("Rohit");		list.add("virat");			list.add("Hardik");
		
		System.out.println("Original List :"+list+ "   Size of List ;"+list.size());
		
		//System.out.println(list.indexOf(43)+"  "+ list.lastIndexOf(43));
		
		DuplicateArrayList test= new DuplicateArrayList();
					list=test.removeDuplicate(list);
		System.out.println("Modified List :"+list+ "      Size of List ;"+list.size());
	}
	
	 List<String> removeDuplicate(List<String> list){
		
//	List <Integer> uniqueList =new ArrayList();		
	
		for (int i=0; i<= (list.size()-1); i++)
		{			
			for (int j=i+1;j<= list.size()-1;j++)
			{
				  if (list.get(i)==list.get(j)) 
				  {
					  list.remove(j);				
				  }
			}
		}
		return list;		
	}
}
