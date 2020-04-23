package PriorityQueue.w3resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueProgramFrom10 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.offer("BLUE");
		queue.offer("RED");
		queue.offer("GREEN");
		System.out.println(queue);

		// iterate each element
		queue.stream().forEach(System.out::println);
       String []str=new String[5];
       queue.toArray(str);
       System.out.println(Arrays.toString(str));
       //convert queue to String
       String str1=queue.toString();
       System.out.println(str1);
       //set priority
       PriorityQueue<String>queue2=new PriorityQueue<>(5, Collections.reverseOrder());
       queue2.add("WHITE");
       queue2.add("GOLD");
       queue2.add("Yellow");
       System.out.println(queue2);

	}

}
