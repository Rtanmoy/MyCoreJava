package Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		PriorityQueue p=new  PriorityQueue<>();
		System.out.println(p.peek());
		//System.out.println(p.element());
		for(int i=1;i<=5;i++) {
		p.offer(i);
		}
     System.out.println(p);
	}

}
