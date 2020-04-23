package SreenuTech;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDuplicateChar {
	public static void main(String[] args) {
		
		String str="program to find duplicate";
		//String[] arr=str.split("");
		List<String> list=Arrays.asList(str.split(""));
	    Set<String>cChar=new HashSet<String>(list);
	    for(String word:cChar) {
	    	System.out.println(word+"---"+Collections.frequency(list, word));
	    }
		
	}

}
