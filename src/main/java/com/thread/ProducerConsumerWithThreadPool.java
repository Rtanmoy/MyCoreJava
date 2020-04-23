package com.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerWithThreadPool {

	public static void main(String[] args) {
		BlockingQueue<Integer> list = new LinkedBlockingDeque<>(2);
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		Runnable producerThread = () -> {
			try {
				int value = 0;
				while (true) {
					list.put(value);
					System.out.println("Produced==>> " + value);
					value++;
					Thread.sleep(1000);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		Runnable consumerThread = () -> {
			try {
				while(true) {
				int value = list.take();
				System.out.println("Consumed==>> " + value);
				Thread.sleep(1000);
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		};

		executorService.execute(producerThread);
		executorService.execute(consumerThread);
		executorService.shutdown();
	}

}
