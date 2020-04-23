package com.interview;

import java.util.HashMap;
import java.util.Map;

public class CountWord {

	public static void main(String[] args) {
		String str="apple apple rose rose ";
		String []arr=str.split(" ");
		Map<String,Integer>map=new HashMap<>();
		for(int i=0;i<=arr.length-1;i++) {
			if(map.containsKey(arr[i])){
				int count=map.get(arr[i]);
				map.put(arr[i],count+1);
			}else {
				map.put(arr[i],1);
			}
		}
  System.out.println(map);
	}

}
