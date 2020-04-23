package com.thread;

class Display {
	public synchronized void  wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("From display ==>> ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThread2 extends Thread {
	Display d;
	String name;

	public MyThread2(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedEx1 {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread2 th = new MyThread2(d, "Tommy");
		MyThread2 th1 = new MyThread2(d, "Tanny");
		th.start();
		th1.start();

	}
}
