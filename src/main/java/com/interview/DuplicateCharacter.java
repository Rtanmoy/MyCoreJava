package com.interview;

public class DuplicateCharacter {

	private static int count;

	public static void main(String[] args) {
		String str="Kolkata";
		char[]arr=str.toLowerCase().toCharArray();
		System.out.println(arr.length+"  "+(arr.length-1));
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					count++;
					break;
				}
			}
			
		}
		System.out.println(count);
	}

}
