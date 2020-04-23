package com.thread;
class MyRunnable implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			Thread.yield();
			System.out.println("From Child Thread");
		}
	}
}
	

public class MyThreadURunnable {

	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t1=new Thread();
		Thread t=new Thread(r);
		System.out.println(t1.getName());
		System.out.println(t.getName());
		Thread.currentThread().setName("Tanmoy");
		System.out.println(Thread.currentThread().getName());
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("From main Thread  "+Thread.currentThread().getName());
		}

	}

}
