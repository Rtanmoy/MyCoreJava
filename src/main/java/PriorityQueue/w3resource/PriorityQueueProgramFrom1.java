package PriorityQueue.w3resource;

import java.util.PriorityQueue;

public class PriorityQueueProgramFrom1 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.offer("BLUE");
		queue.offer("RED");
		queue.offer("GREEN");
		System.out.println(queue);

		// iterate each element
		queue.stream().forEach(System.out::println);

		// add all element
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		queue1.addAll(queue);
		queue1.add("PINK");
		System.out.println(queue1);
		// insert a given element using offer() method

		// remove all element
		// queue1.clear();/// or using removeAll(e) method
		// System.out.println(queue1);

		// count number of elements in queue
		int q = queue.size();
		System.out.println(q);

		for (String s : queue) {
			if (queue1.contains(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			/*
			 * for (String s1 : queue) { System.out.println(queue1.contains(s1)?"YES":"NO");
			 * }
			 */

			// retrive first element
			System.out.println(queue.peek());
			System.out.println(queue.element());
			// remove first element
			System.out.println(queue);
			System.out.println(queue1.poll());
			System.out.println(queue1.remove());
		}
	}

}
