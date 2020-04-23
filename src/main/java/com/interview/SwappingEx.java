package com.interview;

public class SwappingEx {

	public static void main(String[] args) {
		// using third variable
		int x = 10;
		int y = 12;
		System.out.println("x => " + x + "  " + "y => " + y);
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x => " + x + "  " + "y => " + y);

		// without using third variable
		int x1 = 12, y1 = 10;
		System.out.println("x1 => " + x1 + "  " + "y1 => " + y1);
		x1 = x1 + y1;//22
		y1 = x1 - y1;//22-10=12
		x1 = x1 - y1;//22-12=10
		System.out.println("x1 => " + x1 + "  " + "y1 => " + y1);

	}

}
