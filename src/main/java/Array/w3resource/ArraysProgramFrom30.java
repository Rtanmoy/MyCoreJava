package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom30 {

	public static void main(String[] args) {

		int arr[] = { 5, 7, 2, 4, 9, -2, 0 };
		int length = arr.length;
		System.out.println(Arrays.toString(arr));
		// to check if an array of integers without 0 and -1.
		for (int i = 0; i < arr.length; i++) {
			// if(arr[i] == 1 || arr[i]==0)
			if (arr[i] <= 0) {
				System.out.println("Result false");
				arr[i] = arr[arr.length - 1];
				length--;
			} else {
				System.out.println("Result false");
			}
		}
		System.out.println(Arrays.toString(arr));
		// the sum of all the 10's in the array is exactly 30.
		int ten[]=new int[] {10,30,10,40,10,70};
		int sum=0;
		for(int n:ten) {
			if(n==10) {
			 sum+=n;
			}
		}
		if(sum==30) {
			System.out.println("Satisfied");
		} else {
			System.out.println("Not Satisfied");
		}
		//contains two specified elements 65 and 77.
		int specific[]= {65,65,77,65};
		boolean r=false;
		for(int n:specific) {
			 r=n!=65 && n!=77;
			}
		if(r) {
			System.out.println("False");
		}else {
			System.out.println("TRUE");
		}
		
		//remove duplicate
		int dup[]= {20, 20, 30, 40, 50, 50, 50};
		int length1=dup.length;
		for(int i=0;i<length1;i++) {
			for(int j=i+1;j<length1;j++) {
				if(dup[i]==dup[j]) {
					dup[j]=dup[length1-1];
					length1--;
					j--;
				}
			}
		}
		int dup1[]=Arrays.copyOf(dup, length1);
		System.out.println(Arrays.toString(dup)
				            +"  After Removing=> "+Arrays.toString(dup1));
		//****another approach
		 int index = 1;
	        for (int i = 1; i < dup.length; i++) {
	            if (dup[i] != dup[index-1])
	                dup[index++] = dup[i];
	        }
		System.out.println(index);
	}

}
