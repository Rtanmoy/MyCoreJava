package com.array;

public class SumofPerfectSquare {

	static int perfectSqare(int x) {
		if (Math.sqrt(x) == Math.floor(Math.sqrt(x))) {
			return x;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 9, 8, 16 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + perfectSqare(arr[i]);
		}
		System.out.println(sum);

	}

}
