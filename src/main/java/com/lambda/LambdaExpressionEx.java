package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressionEx {

	public static void main(String[] args) {
		
		//**implementing Runnable using Lambda expression**
		
		// Before Java 8:
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do");
			}
		}).start();

		// Java 8 way:
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();
		
		//**Iterating over List using Lambda expressions**

		//Prior Java 8 :
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		for (String feature : features) {
			System.out.println(feature);
		}

		// In Java 8:
		List<String> featuress = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		featuress.forEach(n -> System.out.println(n));

		// Even better use Method reference feature of Java 8
		// method reference is denoted by :: (double colon) operator
		// looks similar to score resolution operator of C++
		features.forEach(System.out::println);
		
		//** to combine Predicate in Lambda Expressions **
		// We can even combine Predicate using and(), or() And xor() logical functions
		 // for example to find names, which starts with J and four letters long, you
		 // can pass combination of two Predicate
		 Predicate<String> startsWithJ = (n) -> n.startsWith("J");
		 Predicate<String> fourLetterLong = (n) -> n.length() == 4;
		   
		 features.stream()
		      .filter(startsWithJ.and(fourLetterLong))
		      .forEach((n) -> System.out.print("\nName, which starts with 'J' and four letter long is :"));
		 
		 //**Map and Reduce example in Java 8 using lambda expressions
		// applying 12% VAT on each purchase
		// Without lambda expressions:
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		for (Integer cost : costBeforeTax) {
		      double price = cost + .12*cost;
		      System.out.println(price);
		}

		// With Lambda expression:
		List<Integer> costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
		costBeforeTax1.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
		
		//**
		

	}

}

