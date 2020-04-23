package com.interview;

public class SecondHighestNumberInArray {
	public static void main(String[] args) {
		int arr[] = {2,7,4,1};
		int largest = 0;
		int secondLargest = 0;
		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] >secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("Largest Number is: " + largest);
	}
}