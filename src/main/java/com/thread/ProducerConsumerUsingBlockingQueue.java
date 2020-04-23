package com.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerUsingBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> queue = new LinkedBlockingDeque<>(4);
		Thread producerThread = new Thread(() -> {
			try {
				int value = 0;
				while (true) {
					queue.put(value);
					System.out.println("Produced==>> " + value);
					value++;
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		Thread consumerThread = new Thread(() -> {
			try {
				while (true) {
					int value = queue.take();
					System.out.println("Consumed==>> " + value);
					Thread.sleep(1000);
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		});
		producerThread.start();
		consumerThread.start();
		producerThread.wait();
		consumerThread.wait();
	}

}
