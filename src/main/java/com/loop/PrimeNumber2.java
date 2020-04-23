package com.loop;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int maxnum=30,minnum=10,count;
 
		System.out.println(" Prime Numbers from 1 to 100 are : ");
		for (int number =minnum; number <= maxnum; number++) {
			count = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && number != 1) {
				System.out.print(number + " ");
			}
		}
	}

}
