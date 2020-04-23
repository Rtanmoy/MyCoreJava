package com.interview.thread;

public class CaseOfThreading {

	public static void main(String[] args) {
		
		FatherAccount fa=new FatherAccount();
		ChildAccount ca=new ChildAccount();
		Thread th=new Thread(ca);
		Thread th1=new Thread(fa);
		th.setName("Father");
		th1.setName("Child");
		th.start();
		th1.start();

	}

}
