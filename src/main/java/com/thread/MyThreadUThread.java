package com.thread;
class MyThread extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("From Child Thread");
		}
	}
}
public class MyThreadUThread {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("From main Thread");
		}

	}

}
