package com.app;

import java.util.Scanner;                         //public String split(String regex)
												//public String split(String regex,int limit)
public class SplitMethod {						  //limit(controls the number of times-
	                                                  //-the pattern is applied and therefore affects the 
	public static void main(String[] args) {              //length ofte resulting array)
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a String::");
		String st=sn.nextLine();
		String[] words=st.split("\\s",2);//Split words depends on white space
		for(String w:words)      //foreach method
		{			
			System.out.println(w);
		}

	}

}
