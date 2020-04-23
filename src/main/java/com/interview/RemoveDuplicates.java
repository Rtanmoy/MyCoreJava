package com.interview;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] intArr= {1,4,7,1,4,7,5,2};
		int tempArr[]=Arrays.stream(intArr).distinct().toArray();
		for(int i:tempArr) {
			System.out.println(i+ " ");
		}

	}

}
